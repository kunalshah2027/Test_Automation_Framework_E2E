package com.ui.pages;

import org.openqa.selenium.By;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.PropertiesUtil.*;
import static com.utility.JSONUtility.*;

public final class HomePage extends BrowserUtility {
	
	private static final By signinlocator = By.xpath("//a[contains(text(),\"Sign\")]");
	
	

	public HomePage(Browser browsername) {
		super(browsername);
		//Gotowebsite(readpropertyfile(QA,"URL"));
		Gotowebsite(readjson(QA));
	}

	public LoginPage GotoLoginPage() {
		click(signinlocator);
		LoginPage LoginPage = new LoginPage(getDriver());
		return LoginPage;
	}

}
