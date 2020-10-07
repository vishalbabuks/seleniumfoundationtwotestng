package com.usingjavaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Semethods{

	public static WebDriver driver;
	public static Properties prop;
	
	public By un=By.xpath("//input[@id='txtUsername']");
	public By pass=By.xpath("//input[@id='txtPassword']");
	By logbuttoon=By.xpath("//input[@id='btnLogin']");
	
	public Semethods() {
		
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\foundationseleniumtwo\\src\\main\\resources\\props\\samprop.properties");
			prop.load(fis);
			System.out.println(prop.getProperty("url"));
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}				
	}
	public static void userclick(WebElement E) {
		// TODO Auto-generated method stub
		E.click();
	}

	public static void closingbrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public static void openbrowser() {
String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\foundationofselenium\\driver\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		else if(browsername.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Testframework\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
	      String urlof=prop.getProperty("url");
	      driver.get(urlof);
	      driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	      driver.manage().window().maximize();
		
	}
		
	

	public static void Usertype(WebElement E, String testdata) {
		// TODO Auto-generated method stub
		E.sendKeys(testdata);
	}

	public static void selectby(WebElement e, String pvalue) {
		Select sop=new Select(e);
		sop.selectByVisibleText(pvalue);
		
	}

}
