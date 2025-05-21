package com.ui.tests;

import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.ui.pages.MyAccountPage;

public class LoginTest3 {

	
		@Test(description = "verify valid user login", groups = {"e2e","sanity"})
		public void Logintest()
		{	
		HomePage homepage = new HomePage(Browser.EDGE,true);
		String title = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com", "password").getusername();
		System.out.println(title);
		
		//MyAccountPage MyAccountPage = LoginPage.doLoginwith("deworek432@magpit.com", "password");
		//String title = MyAccountPage.getusername();
		
		}
		
	}


