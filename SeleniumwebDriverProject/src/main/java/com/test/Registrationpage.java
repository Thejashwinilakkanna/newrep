package com.test;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registrationpage {
	@Test
	public void registration() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/");
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("SignUp")).click();
	driver.findElement(By.id("userName")).sendKeys("Ashwini123");
	driver.findElement(By.id("firstName")).sendKeys("ashwini");
	driver.findElement(By.id("lastName")).sendKeys("kaa");
	driver.findElement(By.id("password")).sendKeys("Password234");
	driver.findElement(By.id("pass_confirmation")).sendKeys("Password234");
	driver.findElement(By.cssSelector("input[value='Female']")).click();
	driver.findElement(By.id("emailAddress")).sendKeys("ashwini123@gmail.com");
	driver.findElement(By.id("mobileNumber")).sendKeys("9986125939");
	//driver.findElement(By.cssSelector("img[src='images/calendar.png']")).click();
	//Select bmonth=new Select(driver.findElement((By.className("ui-datepicker-month"))));
	//bmonth.selectByVisibleText("Dec");
	//Select byear=new Select(driver.findElement((By.className("ui-datepicker-year"))));
	//bmonth.selectByVisibleText("1996");
	
	driver.findElement(By.id("dob")).sendKeys("13/12/1996");
	driver.findElement(By.id("address")).sendKeys("Bangalore");
	Select dd= new Select(driver.findElement(By.id("securityQuestion")));
	dd.selectByValue("411011");
	driver.findElement(By.id("answer")).sendKeys("Red");
	Thread.sleep(4000);

	driver.findElement(By.name("Submit")).click();
	//String text=driver.findElement(By.xpath("//div[contains(text(),'User Registered Succesfully!!! Please login']")).getText();
	//Assert.assertTrue(text.contains(" User Registered Succesfully!!! Please login"));
	//driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
