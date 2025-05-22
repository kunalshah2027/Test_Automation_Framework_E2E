package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class ShipmentPage extends BrowserUtility {
	
	private static final By accept_terms_checkbox_locator = By.id("uniform-cgv");
	private static final By proceed_to_checkout_locator = By.name("processCarrier");

	public ShipmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public PayMentPage gotopaymentpage() {
		clickoncheckbox(accept_terms_checkbox_locator);
		click(proceed_to_checkout_locator);
		return new PayMentPage(getDriver());
	}

}
