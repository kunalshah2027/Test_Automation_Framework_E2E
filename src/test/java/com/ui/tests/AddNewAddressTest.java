package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;
import com.utility.FakerAddressUtility;
import com.ui.pages.AddressPage;
import com.ui.pojo.AddressPojo;
@Listeners({com.ui.listeners.TestListener.class})
public class AddNewAddressTest extends TestBase {
		
	
		private MyAccountPage myaccountpage;
		//private AddressPage AddressPage;
		private AddressPojo AddressPojo;
	
		@BeforeMethod
		public void setup() {
			myaccountpage = homepage.GotoLoginPage().doLoginwith("deworek432@magpit.com","password");
			AddressPojo = FakerAddressUtility.getFakeAddress();
		}
		
		@Test(description = "user go to add address and add it", groups = {"e2e","sanity"})
		public void addnewaddresstest(){
			
			String newAddresstitle = myaccountpage.gotoaddaddressspage().saveaddress(AddressPojo);
			Assert.assertEquals(newAddresstitle, AddressPojo.getaddress_alias_().toUpperCase());
		}
		
		
		
	}


