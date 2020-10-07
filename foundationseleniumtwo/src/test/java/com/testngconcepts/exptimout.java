package com.testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class exptimout {
	

	WebDriver driver;
	By un=By.xpath("//input[@id='txtUsername']");
	By pass=By.xpath("//input[@id='ttt']");
	By logbuttoon=By.xpath("//input[@id='btnLogin']");
	By dashboard=By.xpath("//h1[text()='Dashboard']");
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(invocationTimeOut=1000)
	public void titleofloginpage() {
		String titleofpage=driver.getTitle();
		String expected="OrangeHRM";
		System.out.println(titleofpage);
		Assert.assertEquals(titleofpage, expected);
	
	}
	
	@Test(expectedExceptions=Exception.class)
	public void login() {
		driver.findElement(un).sendKeys("admin");
		driver.findElement(pass).sendKeys("admin123");
	
	}
	@Test(expectedExceptions=ArithmeticException.class)
	public void Dividebyzero() {
		int i = 1 / 0;
		 
	       System.out.println("Value of i :" + i);
	
	}
	

}
