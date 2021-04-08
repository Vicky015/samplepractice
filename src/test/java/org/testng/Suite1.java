package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Suite1 {
	
	
	@Parameters({"email","pass"})
	@Test(dataProvider="sample")
	private void tc1(@Optional("xyz@gmail.com")String email,String pass) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\java prog\\SELETASK\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys(email);
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys(pass);
	}
	
	@DataProvider(name="sample")
	public Object[] [] data(){
		return new Object [] [] {
			{"vk","123"},
			{"vic","678"},
			{"vig","987"}
			
			
				};
	
	}
	
	}
	
	

