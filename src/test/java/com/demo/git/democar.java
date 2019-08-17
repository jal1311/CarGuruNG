package com.demo.git;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class democar {
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");
		driver = new ChromeDriver();
		// baseUrl = "https://www.katalon.com/";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testLinks() {
		driver.get("https://www.cargurus.com/");
		driver.findElement(By.linkText("Used Cars")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("New Cars")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Financing")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Car Values")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Sell My Car")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Research")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Questions")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Advertise")).click();
		System.out.println(driver.getTitle());
		
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}



