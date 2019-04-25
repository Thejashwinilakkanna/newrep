package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.ReadDataExcel;

public class testclass {
	WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{
		
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	
	@Test(dataProvider="dp1")                               
	public void TestLogin(String username,String password)throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("SignOut")));
		Assert.assertTrue(driver.getTitle().contains("Home"));
		
		driver.findElement(By.partialLinkText("SignOut")).click();
				//Thread.sleep(5000);
	
		//wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("SignIn")));
//	driver.findElement(By.partialLinkText("SignIn")).click();
	
	}
	@DataProvider(name="dp1")
	public Object[][] getData()
	{
		//Object[][] obj = {
			//	{"Lalitha","Password123"},{"admin","Password456"}
		//};
		return ReadDataExcel.testReadExcel("sheet1");
				
		}
	
		
		
		
	}
	
	
	
	
	
	
	


