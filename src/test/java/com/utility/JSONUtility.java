package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectInputFilter.Config;

import com.constants.Env;
import com.google.gson.Gson;
import com.ui.pojo.Environment;
import com.ui.pojo.config;

public class JSONUtility {

	public static Environment readjson(Env env) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		File jsonfile = new File(System.getProperty("user.dir") + "\\config\\config.json");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(jsonfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		config config = gson.fromJson(fileReader, config.class);
		Environment environment = config.getEnvironments().get("QA");
		//System.out.println(environment.getUrl());
		return environment;
	}

}
