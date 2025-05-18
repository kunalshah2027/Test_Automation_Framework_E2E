package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pojo.User;

public class LoginTest {

		private HomePage homepage;
		@BeforeMethod(description = "do browser setup before test method")
		public void setup()
		{
			homepage = new HomePage(Browser.CHROME);
		}
	
		 
		@Test(description = "verify valid user login", groups = {"e2e","sanity"},
				dataProviderClass = com.ui.dataproviders.LoginDataProvider.class , dataProvider = "LoginDataProvider")
		public void Logintest(User user)
		{	
		//String title = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com", "password").getusername();
		Assert.assertEquals(homepage.GotoLoginPage().doLoginwith(user.getEmailAddress(), user.getPassword()).getusername(), "Kunal Shaha");
		}
		
	}


