package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ui.pojo.AddressPojo;
import com.utility.BrowserUtility;

public class ProductCheckOutPage extends BrowserUtility {
	
	private static final By company_textbox_locator = By.id("company");
	private static final By address1_textbox_locator = By.id("address1");
	private static final By address2_textbox_locator = By.id("address2");
	private static final By city_textbox_locator = By.id("city");
	private static final By post_code_textbox_locator = By.id("postcode");
	private static final By home_phone_textbox_locator = By.id("phone");
	private static final By mobile_number_textbox_locator = By.id("phone_mobile");
	private static final By other_info_textbox_locator = By.id("other");
	private static final By address_alias_textbox_locator = By.id("alias");
	private static final By state_dd_locator = By.id("id_state");
	private static final By save_address_locator = By.id("submitAddress");
	private static final By address_heading_locator = By.tagName("h3");

	public ProductCheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String saveaddress(AddressPojo AddressPojo) {
		
		entertext(address_alias_textbox_locator,AddressPojo.getaddress_alias_());
		selectfromdd(state_dd_locator,AddressPojo.getState_());
		click(save_address_locator);
		String newAddress = visibletext(address_heading_locator);
		return newAddress;
		
	}

}
