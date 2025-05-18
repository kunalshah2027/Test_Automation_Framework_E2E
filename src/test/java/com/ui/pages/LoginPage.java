package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility{
	
	private static final By emailtextboxlocator = By.id("email");
	private static final By passwordtextboxlocator = By.id("passwd");
	private static final By submitloginbuttonlocator = By.id("SubmitLogin");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public MyAccountPage doLoginwith(String un, String psw)
	{
		entertext(emailtextboxlocator,un);
		entertext(passwordtextboxlocator,psw);
		click(submitloginbuttonlocator);
		MyAccountPage MyAccountPage = new MyAccountPage(getDriver());
		return MyAccountPage;
	}

}
