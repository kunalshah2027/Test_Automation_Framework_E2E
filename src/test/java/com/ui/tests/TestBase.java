package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LambdaTest;

public class TestBase {
	protected HomePage homepage;
	private boolean islambdatest;
	@Parameters({"browser","islambdatest","isheadless"})
	@BeforeMethod(description = "do browser setup before test method")
	public void setup(@Optional ("chrome")String browser 
			, @Optional ("false") boolean islambdatest, 
			@Optional ("false") boolean isheadless , ITestResult result){
		WebDriver lambdadriver;
		this.islambdatest = islambdatest;
		if (islambdatest) {
			lambdadriver = LambdaTest.intializelambdatestsession(browser,result.getMethod().getMethodName() );
			homepage = new HomePage(lambdadriver);
		} 
		else {
			homepage = new HomePage(Browser.valueOf(browser.toUpperCase()),true);
		}
	}
	
	public BrowserUtility getinstance() {
		return homepage;
	}
	
	@AfterMethod(description = "do browser setup after test method")
	public void teardown() {
		if (islambdatest) {
			LambdaTest.quitsession();
		}else {
			homepage.quit();
		}
		
	}

}
