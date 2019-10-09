package com.acti.TestCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.Base.DriverScript;
import com.acti.Helper.ScreenShot2;
import com.acti.pages.LoginPage2;
import com.acti.pages.TaskPage2;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Test_BaseClass2 extends DriverScript {
	
	 ExtentHtmlReporter HtmlReporter;
	 ExtentReports Er;
	 ExtentTest logger;
	 LoginPage2 lp;
	 TaskPage2 tp;
	 public  Test_BaseClass2()
	 {
		 super();
	 }
		 @BeforeMethod
			public void PreTest()
			{
		HtmlReporter=new ExtentHtmlReporter("C:\\FrameWork\\Telecommunication\\Reports\\Automation.html");
               Er= new ExtentReports();
			 Er.attachReporter(HtmlReporter);
				SetUp();
				lp=new LoginPage2();
			    tp=new TaskPage2();
			}
		 //what is ITest Resukt in test ng 
		//ITestResult is an interface in the testng  that capature the   status  the test case it will give you pass status if the test case is pass or fail if the test case is fail  
		 @AfterMethod
		 public void PostTest(ITestResult result) throws Exception
		 {
		 if(result.getStatus()==ITestResult.FAILURE)
		 {
			 String screenshootpath = ScreenShot2.takeSnapShot(driver, "ScreenshootName");
			 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"TestCase FAILED due to below issue: ", ExtentColor.RED));
			 logger.fail(result.getThrowable());
			 logger.fail("Snapshot below:" +logger.addScreenCaptureFromPath(screenshootpath));
		 }
		 else if(result.getStatus()==ITestResult.SUCCESS)
		 {
		logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"TestCase PASS: ", ExtentColor.GREEN));
		 }
		 else
		 {
			 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"TestCase SKIPPED: ", ExtentColor.ORANGE));
			 logger.skip(result.getThrowable());
		 }
			 Er.flush();
			 driver.close();
		 }
	 }

