package com.acti.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.pages.LoginPage2;
import com.acti.pages.TaskPage2;
import com.acti.pages.LoginPage2;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TC_TaskPage2 extends Test_BaseClass2 {
	Test_BaseClass2 tbc;
	public  LoginPage2 lp;
	TaskPage2 tp;
	
	@Test(priority=1)
	public void EnterInTask() throws InterruptedException
	{
	logger=Er.createTest("Create New Task");
	 tbc =new Test_BaseClass2();
	 tbc.PreTest();
	 lp=new LoginPage2();
	 tp=new TaskPage2();
		//logger.log(Status.PASS, )
		
     lp.EnterLoginCredential("admin","manager");
 	logger.log(Status.PASS,"Log in to applicaion" );
     tp.TaskButton();
 	/*loggePASS,"Click On The Task Button" );
     tp.CreateNewTask("database", "cpc", "selenium3");
    r.log(Status. logger.log(Status.PASS,"Creating the task" );
    // tbc.PostTest();
*/	}

}
