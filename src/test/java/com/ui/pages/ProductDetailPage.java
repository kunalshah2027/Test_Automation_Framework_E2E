package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Size;
import com.utility.BrowserUtility;

public class ProductDetailPage extends BrowserUtility{
	
	private static final By size_dd_locator = By.id("group_1");
	private static final By add_to_cart_locator = By.name("Submit");
	private static final By proceed_to_checkout_locator = By.xpath("//a[@title=\"Proceed to checkout\"]");
	public ProductDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ProductDetailPage changesize(Size size) {
		selectfromdd(size_dd_locator,size.toString());
		return new ProductDetailPage(getDriver());
		
	}
	
	public ProductDetailPage addtoproductcard() {
		click(add_to_cart_locator);
		return new ProductDetailPage(getDriver());
	}
	
	public ShoppingCartPage proceedtocheckout() {
		click(proceed_to_checkout_locator);
		return new ShoppingCartPage(getDriver());
	}

}
