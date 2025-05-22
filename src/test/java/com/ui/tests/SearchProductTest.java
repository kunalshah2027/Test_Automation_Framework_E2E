package com.ui.tests;




import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;



@Listeners({com.ui.listeners.TestListener.class})
public class SearchProductTest extends TestBase {
		
	
		private MyAccountPage myaccountpage;
		private static final String search_string = "Printed Summer Dresses";
	
		@BeforeMethod
		public void setup() {
			myaccountpage = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com","password");
		}
		
		@Test(description = "user search and verify it", groups = {"e2e","sanity"})
		public void searchproduct(){
			
			//String title = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com", "password").getusername();
			boolean actresult = myaccountpage.searchproduct(search_string).issearchresulttermpresentinproductlist(search_string);
			System.out.println(actresult);
			Assert.assertEquals(actresult, true);
		}
		
		
		
	}


