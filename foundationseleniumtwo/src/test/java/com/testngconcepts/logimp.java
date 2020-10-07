package com.testngconcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class logimp  implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The test is starting");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase passed is :"+result.getMethod());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase failed is :"+result.getMethod());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase Skipped is :"+result.getMethod());	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
