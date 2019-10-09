package com.acti.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.pages.LoginPage2;

import junit.framework.Assert;


public class TC_LoginPage2 extends  DriverScript  {
	public static LoginPage2 lp;
	
	public  TC_LoginPage2()
	{
		super();
	}
@BeforeClass
public void launch()
{
	SetUp();
}
@AfterClass
public void teardown()
{
	driver.close();
}
@Test(priority=1)
public void logo()
{

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 lp=new LoginPage2();
	boolean flag = lp.logovalidation();
}
@Test(priority=2)
public void text()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String Actual = lp.validatingTheText();
	System.out.println(Actual);
	String Expected="Please identify yourself";
	Assert.assertEquals(Expected, Actual);
}
@Test(priority=3)
public void credentail()
{

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 lp=new LoginPage2();
	lp.EnterLoginCredential("admin","manager");
}

}
