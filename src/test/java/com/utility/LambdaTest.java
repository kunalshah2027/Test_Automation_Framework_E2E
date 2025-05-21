package com.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaTest {
	private static final String hub_URL = "https://hub.lambdatest.com/wd/hub";
	private static ThreadLocal<WebDriver> localdriver = new ThreadLocal<WebDriver>();
	private static ThreadLocal<DesiredCapabilities> localcapabilities = new ThreadLocal<DesiredCapabilities>();
	
	
	public static WebDriver intializelambdatestsession(String browser,String testname) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("browserVersion", "127");
        Map<String, Object> ltOptions = new HashMap<>();
        ltOptions.put("user", "kunalshah6121993");
        ltOptions.put("accessKey", "LT_wxbOPU9JsCusIlJD2LcXCKrFQF9Y6wDrtF0Uldk4R0IJ9BU");
        ltOptions.put("build", "Selenium 4");
        ltOptions.put("name",testname);
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("seCdp", true);
        ltOptions.put("selenium_version", "4.23.0");
        capabilities.setCapability("LT:Options", ltOptions);
        localcapabilities.set(capabilities);
        WebDriver driver=null;
		try {
			driver = new RemoteWebDriver(new URL(hub_URL), localcapabilities.get());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        localdriver.set(driver);
        return localdriver.get();
	}
	
	public static void quitsession() {
		if (localdriver.get()!=null) {
			localdriver.get().quit();
		}
	}

}
