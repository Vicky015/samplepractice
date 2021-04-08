package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver ;

	@BeforeClass
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver","E:\\java prog\\SELETASK\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	}
	
	@AfterClass
	private void afterClass() {
		driver.quit();
	}
	@BeforeMethod
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@AfterMethod
	private void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	private void tc0() {
		driver.findElement(By.id("username")).sendKeys("scofield");
		driver.findElement(By.id("password")).sendKeys("prisonbreak");
		driver.findElement(By.id("login")).click();
	}
}
