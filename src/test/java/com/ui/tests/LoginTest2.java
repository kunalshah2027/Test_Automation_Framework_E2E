package com.ui.tests;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.ui.pages.MyAccountPage;

public class LoginTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomePage homepage = new HomePage(Browser.EDGE,true);
		homepage.maximize();
		LoginPage LoginPage = homepage.GotoLoginPage();
		MyAccountPage MyAccountPage = LoginPage.doLoginwith("deworek432@magpit.com", "password");
		String title = MyAccountPage.getusername();
		System.out.println(title);
		
	}

}
