package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class googlehomepage {
	@Test
	public void googleHomePage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.03\\selenium2\\chromedriver.exe");
		WebDriver driver= DriverUtility.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		String title=driver.getTitle();
		Assert.assertEquals(title, "google");
		
		
		
	}

}
