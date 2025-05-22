package com.ui.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class SearchResultPage extends BrowserUtility {

	
	private static final By product_listing_title = By.xpath("//span[@class=\"lighter\"]");
	private static final By all_product_list_name = By.xpath("//h5[@itemprop=\"name\"]/a");
	public SearchResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public String gettitle() {
		
		return visibletext(product_listing_title);
		
	}
	
	public boolean issearchresulttermpresentinproductlist(String searchstring) {
		List<String> keyword = Arrays.asList(searchstring.toLowerCase().split(" "));
		System.out.println(keyword);
		List<String> product_name_list = getallvisibletext(all_product_list_name);
		System.out.println(product_name_list);
		boolean result = product_name_list.stream()
		.anyMatch(name -> (keyword.stream().anyMatch(name.toLowerCase()::contains)));
		System.out.println(result);
		return result;
	}
	
	public ProductDetailPage clickonproduct(int index) {
		click(getallelements(all_product_list_name).get(index));
		ProductDetailPage productdetailpage = new ProductDetailPage(getDriver());
		return productdetailpage;
	}

}
