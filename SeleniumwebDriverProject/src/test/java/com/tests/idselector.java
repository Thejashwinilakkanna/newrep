package com.tests;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class idselector {
	WebDriver driver;
	


	@Test
public void testDemoWebShop() {
		driver.get("http://demowebshop.tricentis.com/login");
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("webshop"));
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("ashwin@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}
}

		
		
		
		
		
	
