package com.testngconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basictest {
	@BeforeSuite
	public void besuit() {
		System.out.println("This is a before suite method");
	}
	@BeforeClass
	public void becl() {
		System.out.println("This is a before class method");
	}
	@BeforeTest
	public void beftes() {
		System.out.println("This is a before test method");
	}
	
	@BeforeMethod
	public void setup() {
		
		System.out.println("this is a setup method");
	}
	
	@Test
	public void testing() {
		System.out.println("This is a basic test");
	}
	@AfterMethod
public void teardown() {
		System.out.println("this is a teardown method");
	}
	@AfterSuite
public void afsuit() {
	System.out.println("This is a after suite method");
	}
	@AfterClass
	public void afcl() {
		System.out.println("This is a after class method");
	}
	@AfterTest
	public void afftes() {
		System.out.println("This is a after test method");
	}
	

}
