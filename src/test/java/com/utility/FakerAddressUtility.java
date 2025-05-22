package com.utility;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.ui.pojo.AddressPojo;

public class FakerAddressUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static AddressPojo getFakeAddress() {
		
		
		Faker faker = new Faker(Locale.US);
		AddressPojo AddressPojo = new AddressPojo(
				faker.company().name(), faker.address().buildingNumber(), faker.address().streetAddress(),faker.address().city(),
				faker.numerify("#####"), faker.phoneNumber().cellPhone(), faker.phoneNumber().cellPhone(), "other", "office", 
				faker.address().state());
		return AddressPojo;
		
		
	}

}
