package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestkeyboardActions {

	@Test
	public void testkeyboard()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Selenium\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("myInput"));
		Actions act1=new Actions(driver);
		act1.keyDown(search,Keys.SHIFT).perform();
		act1.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").perform();
		act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().perform();
	driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
	}
}
