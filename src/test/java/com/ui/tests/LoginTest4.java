package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest4 {

		private HomePage homepage;
		@BeforeMethod(description = "do browser setup before test method")
		public void setup()
		{
			homepage = new HomePage(Browser.CHROME);
		}
	
		
		@Test(description = "verify valid user login", groups = {"e2e","sanity"})
		public void Logintest()
		{	
		//String title = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com", "password").getusername();
		Assert.assertEquals(homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com", "password").getusername(), "Kunal shaha");
		}
		
	}


