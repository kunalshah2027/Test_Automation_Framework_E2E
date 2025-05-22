package com.ui.tests;




import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.constants.Size;
import com.ui.pages.MyAccountPage;
import com.ui.pages.SearchResultPage;



@Listeners({com.ui.listeners.TestListener.class})
public class ProductCheckOutTest extends TestBase {
		
	
		private SearchResultPage searchresultpage;
		private static final String search_string = "Printed Summer Dresses";
	
		@BeforeMethod
		public void setup() {
			searchresultpage = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com","password").searchproduct(search_string);
		}
		
		@Test(description = "user search and verify it", groups = {"e2e","sanity"})
		public void productcheckouttest(){
			
			String result = searchresultpage.clickonproduct(0).changesize(Size.L).addtoproductcard().proceedtocheckout()
			.gotoconfirmaddresspage().gotoshippmentpage().gotopaymentpage().makepayment();
			System.out.println(result);
			
			Assert.assertTrue(result.contains("complete"));;
			
		}
		
		
	}


