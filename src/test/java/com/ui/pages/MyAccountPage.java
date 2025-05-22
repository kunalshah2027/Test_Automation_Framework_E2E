package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class MyAccountPage extends BrowserUtility{

	
	private static final By user_name_locator = By.xpath("//a[@title=\"View my customer account\"]/span");
	private static final By search_box_locator = By.id("search_query_top");
	private static final By add_new_address_locator = By.xpath("//a[@title=\"Add my first address\"]");
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String getusername()
	{
		return visibletext(user_name_locator);
	}
	
	
	public SearchResultPage searchproduct(String searchstring) {
		entertext(search_box_locator,searchstring);
		enterkeys(search_box_locator,Keys.ENTER);
		SearchResultPage searchResultPage = new SearchResultPage(getDriver());
		return searchResultPage;
		
	}
	
	public AddressPage gotoaddaddressspage() {
		click(add_new_address_locator);
		AddressPage AddressPage = new AddressPage(getDriver());
		return AddressPage;
		
	}

}
