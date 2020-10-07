package com.conceptsofjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Looping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
		
	       WebDriver driver=new ChromeDriver();
		    
	        driver.get("https://www.wedmegood.com/vendors/all/wedding-venues/");
		
	        List<WebElement> listof = driver.findElements(By.xpath("//a[@class='vendor-detail text-bold h6']"));

	        System.out.println(listof.size());
	        
	        for (WebElement webElement : listof) {
	            String name = webElement.getText();
	            System.out.println(name);
	        }
	}

}
