package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	private static final int max_retry_number = 1;
	private static int current_retry_number=1;
	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (current_retry_number <= max_retry_number)
		{
			current_retry_number++;
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	
	

}
