package com.testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pram {
	WebDriver driver;
	By un=By.xpath("//input[@id='txtUsername']");
	By pass=By.xpath("//input[@id='txtPassword']");
	By logbuttoon=By.xpath("//input[@id='btnLogin']");
	By dashboard=By.xpath("//h1[text()='Dashboard']");
	
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	@Test
	@Parameters({"hrmusername","hrmpassword"})
	public void login(String unn,String pwd) {
		driver.findElement(un).sendKeys(unn);
		driver.findElement(pass).sendKeys(pwd);
		driver.findElement(logbuttoon).click();
		System.out.println("user logged in the hrm app");
	}

}
