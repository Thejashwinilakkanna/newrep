package com.test;

import java.text.SimpleDateFormat;

import org.testng.Assert;
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

public class Report {


ExtentHtmlReporter htmlreporter;
 
ExtentReports reports;
 
ExtentTest logger;
 
@BeforeClass
 
public void beforeClass()

{

 
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ms");

 
String path=System.getProperty("user.dir")+"/extent-reports/"+sdf.format(new java.util.Date())+".html";
 
htmlreporter=new ExtentHtmlReporter(path);
 
reports=new ExtentReports();
 
reports.attachReporter(htmlreporter);
 
reports.setSystemInfo("username", "kalyani");
 
htmlreporter.config().setReportName("Test Me App");



}
 
@Test
 
public void passTest()

{
 
logger=reports.createTest("passTest");
 
logger.log(Status.INFO,"pass test started");
 
Assert.assertTrue(true);

}
 
@Test
 
public void failTest()

{
 
logger=reports.createTest("fail Test");
 
logger.log(Status.INFO,"fail test started");
 
Assert.assertTrue(false);

}
 
@Test
 
public void skipTest()

{
 
logger=reports.createTest("skip Test");
 
logger.log(Status.INFO,"skip test started");
 
throw new SkipException("SKIP");

}

 
@AfterMethod
 
public void afterMethod(ITestResult result)

{
 
if(result.getStatus()==ITestResult.FAILURE)

{
 
logger.log(Status.FAIL, "The test is failed");

}
 
else if(result.getStatus()==ITestResult.SUCCESS)

{
 
logger.log(Status.PASS, "The test is passed");

}
 
else if(result.getStatus()==ITestResult.SKIP)

{
 
logger.log(Status.SKIP, "The test is skiped");

}


}

 
@AfterClass
 
public void afterClass()

{
 
reports.flush();

}


}









