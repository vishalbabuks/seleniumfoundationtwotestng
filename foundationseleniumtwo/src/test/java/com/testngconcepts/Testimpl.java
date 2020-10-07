package com.testngconcepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.usingjavaconcepts.Semethods;

public class Testimpl extends Semethods{


	/*public Testimpl() {
		super();
	}*/
	@BeforeMethod
	public void setup() {
		
		Semethods.openbrowser();
	}
	@Test(groups="login page")
	public void verifytitleofloginpage() {
		String titleofpage=Semethods.driver.getTitle();
		String expected="OrangeHRM";
		System.out.println(titleofpage);
		Assert.assertEquals(titleofpage, expected);
	}

	@AfterMethod
	public void teardown() {
		Semethods.closingbrowser();
		}
}
