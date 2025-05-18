package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class MyAccountPage extends BrowserUtility{

	
	private static final By user_name_locator = By.xpath("//a[@title=\"View my customer account\"]/span");
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getusername()
	{
		return visibletext(user_name_locator);
	}

}
