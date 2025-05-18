package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.constants.Browser;

public abstract class BrowserUtility {
	//It will wrap all the selenium methods inside it and we will call this from test
	
	private WebDriver driver;

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	public BrowserUtility(Browser browsername)
	{
		if (browsername == Browser.CHROME)
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new EdgeDriver();
		}
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}



	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}



	public void Gotowebsite(String url)
	{
		driver.get(url);
		maximize();
	}
	
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public void click(By locator)
	{
		WebElement element = driver.findElement(locator);
		element.click();
	}
	
	public void entertext(By locator,String text)
	{
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	
	public String visibletext(By locator)
	{
		WebElement element = driver.findElement(locator);
		return element.getText();
	}
	

}
