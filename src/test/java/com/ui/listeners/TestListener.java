package com.ui.listeners;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ui.tests.TestBase;
import com.utility.BrowserUtility;
import com.utility.ExtentReporterUtility;
import com.utility.LoggerUtility;

public class TestListener implements ITestListener {
	Logger logger = LoggerUtility.getLogger(this.getClass());
	
	ExtentSparkReporter extentSparkReporter;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	public void onTestStart(ITestResult result) {
		logger.info(result.getMethod().getMethodName());
		logger.info(result.getMethod().getDescription());
		logger.info(Arrays.toString(result.getMethod().getGroups()));
	    // not implemented
		ExtentReporterUtility.createExtentTest(result.getMethod().getMethodName());
	  }
	
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		ExtentReporterUtility.gettest().log(Status.PASS, result.getMethod().getMethodName());
	  }
	
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("in failure listener");
		ExtentReporterUtility.gettest().log(Status.FAIL, result.getMethod().getMethodName());
		Object testclass = result.getInstance();
		BrowserUtility BrowserUtility = ((TestBase)testclass).getinstance();
		String path = BrowserUtility.takescreenshot(result.getMethod().getMethodName());
		System.out.println(path);
		ExtentReporterUtility.gettest().addScreenCaptureFromPath(path);
		System.out.println("failure listener completed");
		}
	
	public void onTestSkipped(ITestResult result) {
	    // not implemented
		ExtentReporterUtility.gettest().log(Status.SKIP, result.getMethod().getMethodName());
	  }
	
	public void onStart(ITestContext context) {
	    // not implemented
		ExtentReporterUtility.setupSparkReporter("report.html");
	  }

	public void onFinish(ITestContext context) {
	    // not implemented
		ExtentReporterUtility.flushreport();
	  }


}
