package com.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.io.FileHandler;

import com.constants.Browser;

public abstract class BrowserUtility {
	//It will wrap all the selenium methods inside it and we will call this from test
	
	//private WebDriver driver;
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver.set(driver);
		// TODO Auto-generated constructor stub
	}
	
	public BrowserUtility(Browser browsername)
	{	
		System.out.println("in non-headeless blk");
		if (browsername == Browser.CHROME)
		{
			driver.set(new ChromeDriver());
		}
		else
		{
			driver.set(new EdgeDriver());
		}
	}
	
	public BrowserUtility(Browser browsername,boolean isheadless)
	{
		System.out.println("in headeless blk");
		if (browsername == Browser.CHROME){
			if (isheadless) {
				System.out.println("in headeless true blk");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless=new");
				//options.addArguments("--headless=old");
				options.addArguments("--window--size=1920,1080");
				driver.set(new ChromeDriver());
			}
			else {
				//driver.set(new ChromeDriver());
			}
			
		}
		else
		{
			if (isheadless) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--headless=old");
			options.addArguments("disable-gpu");
			driver.set(new ChromeDriver());
		}
		else {
			driver.set(new ChromeDriver());
		}
		}
	}
	
	
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void quitdriver() {
		driver.get().quit();
	}



	public void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}



	public void Gotowebsite(String url)
	{
		driver.get().get(url);
		maximize();
	}
	
	public void maximize()
	{
		driver.get().manage().window().maximize();
	}
	
	public void click(By locator)
	{
		WebElement element = driver.get().findElement(locator);
		element.click();
	}
	
	public void entertext(By locator,String text)
	{
		WebElement element = driver.get().findElement(locator);
		element.sendKeys(text);
	}
	
	public String visibletext(By locator)
	{
		WebElement element = driver.get().findElement(locator);
		return element.getText();
	}
	
	public String takescreenshot(String name) {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		SimpleDateFormat simpledateformat = new SimpleDateFormat("HH-mm-ss");
		String dateformat = simpledateformat.format(date);
		String path = System.getProperty(("user.dir") + "//screenshots"+ name +"- " + dateformat + ".png");
		System.out.println(path);
		File screeshotfiles = new File(path);
		
		//Path to the location to save screenshot
		try {
			FileHandler.copy(source, screeshotfiles);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//FileHandler.(source, screeshotfiles);
		System.out.println("Screenshot is captured");
		return path;
	}
	

}
