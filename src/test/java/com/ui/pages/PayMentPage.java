package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;

public class PayMentPage extends BrowserUtility {
	
	private static final By payment_by_wire_locator = By.xpath("//a[@title=\"Pay by bank wire\"]");
	private static final By confirm_payment_btn_locator = By.xpath("//p[contains(@class,\"cart_navigation\")]/button");
	private static final By alert_success_msg_locator = By.xpath("//p[contains(@class,\"success\")]");
	

	public PayMentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String makepayment() {
		click(payment_by_wire_locator);
		click(confirm_payment_btn_locator);
		return visibletext(alert_success_msg_locator);
	}



}
