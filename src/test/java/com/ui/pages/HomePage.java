package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.JSONUtility.*;

public final class HomePage extends BrowserUtility {
	
	private static final By signinlocator = By.xpath("//a[contains(text(),\"Sign\")]");
	
	

	public HomePage(Browser browsername,boolean isheadeless) {
		super(browsername,isheadeless);
		//Gotowebsite(readpropertyfile(QA,"URL"));
		Gotowebsite(readjson(QA).getUrl());
	}

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		Gotowebsite(readjson(QA).getUrl());
	}

	public LoginPage GotoLoginPage() {
		click(signinlocator);
		LoginPage LoginPage = new LoginPage(getDriver());
		return LoginPage;
	}

	public void quit() {
		// TODO Auto-generated method stub
		quitdriver();
		
	}

}
