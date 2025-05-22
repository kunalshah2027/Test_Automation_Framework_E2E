package com.ui.tests;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({com.ui.listeners.TestListener.class})
public class InvalidLoginTest extends TestBase {
		private static final String un = "kunal.shaha@xyz.com";
		private static final String psw = "12345";
		
		
		
		@Test(description = "verify Invalid user login", groups = {"e2e","sanity"})
		public void invalidlogintest(){
			
			//String title = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com", "password").getusername();
			Assert.assertEquals(homepage.GotoLoginPage().doLoginwithinvalidcreds(un, psw).geterrormsg(),"Authentication failed.");
		}
		
		
		
	}


