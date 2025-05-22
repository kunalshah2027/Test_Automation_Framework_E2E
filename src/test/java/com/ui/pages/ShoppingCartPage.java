package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Size;
import com.utility.BrowserUtility;

public class ShoppingCartPage extends BrowserUtility {
	
	private static final By proceed_to_checkout_locator = By.
			xpath("//p[contains(@class,\"cart_navigation\")]/a[@title=\"Proceed to checkout\"]");
	

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ConfirmAddressPage gotoconfirmaddresspage() {
		click(proceed_to_checkout_locator);
		return new ConfirmAddressPage(getDriver());
		
	}

}
