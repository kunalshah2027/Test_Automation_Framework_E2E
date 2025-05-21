package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterUtility {
	private static ExtentReports extentReports;
	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	public static void setupSparkReporter(String reportname)
	{
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//"+reportname);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
	}
	
	public static void createExtentTest(String testname)
	{
		ExtentTest test = extentReports.createTest(testname);
		extentTest.set(test);
	}
	
	public static ExtentTest gettest() {
		return extentTest.get();
	}
	
	public static void flushreport()
	{
		extentReports.flush();
	}

}
