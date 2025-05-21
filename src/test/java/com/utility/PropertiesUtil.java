package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.constants.Env;

public class PropertiesUtil {

	public static String readpropertyfile (Env env,String parameter) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		File propfile = new File(System.getProperty("user.dir") + "//config//"+env+".properties");
		FileReader fileReader = null;
		Properties properties = new Properties();
		try {
			fileReader = new FileReader(propfile);
			properties.load(fileReader);
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
		String value = properties.getProperty(parameter);
		System.out.println(value);
		return value;
		

	}

}
