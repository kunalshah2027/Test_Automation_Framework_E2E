package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class ConfirmAddressPage extends BrowserUtility {
	
	private static final By confirm_address_locator = By.name("processAddress");
	public ConfirmAddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ShipmentPage gotoshippmentpage()
	{
		click(confirm_address_locator);
		return new ShipmentPage(getDriver());
	}

}
