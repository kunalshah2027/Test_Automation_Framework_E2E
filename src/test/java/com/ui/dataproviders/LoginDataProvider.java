package com.ui.dataproviders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojo.Environment;
import com.ui.pojo.User;
import com.ui.pojo.config;
import com.ui.pojo.testdata;

public class LoginDataProvider {
	
	@DataProvider(name = "LoginDataProvider")
	public Iterator<Object[]> logindataprovider() {
		Gson gson = new Gson();
		File jsonfile = new File(System.getProperty("user.dir") + "//src//test//java//com//ui//dataproviders//logindata.json");
		System.out.println(System.getProperty("user.dir"));
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(jsonfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		testdata testdata = gson.fromJson(fileReader, testdata.class);
		List <Object[]> datatoreturn = new ArrayList<Object[]>();
		for (User user:testdata.getData())
		{
			datatoreturn.add(new Object[] {user});
		}
		return datatoreturn.iterator();
	}

}
