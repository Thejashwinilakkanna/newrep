package com.test;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestExtentReport {
	WebDriver driver;
	ExtentHtmlReporter htmlreporter;
	ExtentReports reports;
	ExtentTest logger;
	@BeforeClass
	public void beforeClass()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms");
		String path=System.getProperty("user.dir")+"/extent-reports/"+sdf.format(new Date())+".html";
		htmlreporter=new ExtentHtmlReporter(path);
		reports=new ExtentReports();
		reports.setSystemInfo("username","aswani.kumar.avilala");
		reports.setSystemInfo("host", "");
		
		
	}
	@Test
	public void passTest()
	{
		
	}
	@Test
	public void failTest()
	{
		
	}
	@Test
	public void skiptest()
	{
		logger=reports.createTest("skiptest");
		logger.log(Status.INFO,"skip test started");
		throw new SkipException("SKIP");
		
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(Status.FAIL, "The test is failed");
			TakesScreenshot ts=(TakesScreenshot) drive;
			File srcfile=ts.getScreenshotAs(OutputType.FILE);
			String 
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, "The test is passed");
		}
		else if(result.getStatus()==ITestResult.SKIP)	
		{
			logger.log(Status.SKIP, "The test is skipped");
			
		}
	}
	
	
    @AfterClass
     public void afterClass()
   {
	
   }

}
