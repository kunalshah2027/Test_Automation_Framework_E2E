package com.ui.tests;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ui.pojo.User;


@Listeners({com.ui.listeners.TestListener.class})
public class LoginTest extends TestBase {
		
		
		
		
		@Test(description = "verify valid user login", groups = {"e2e","sanity"},
				dataProviderClass = com.ui.dataproviders.LoginDataProvider.class , dataProvider = "LoginDataProvider",
				retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
		public void Logintest(User user){
			
			//String title = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com", "password").getusername();
			Assert.assertEquals(homepage.GotoLoginPage().doLoginwith(user.getEmailAddress(), user.getPassword()).
					getusername(), "Kunal Shaha");
		}
		
		
		
	}


