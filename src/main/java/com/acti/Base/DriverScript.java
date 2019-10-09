package com.acti.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverScript {
	public static WebDriver driver;
	static Properties pro;
	FileInputStream fis;
	public  DriverScript()
	{
		try
		{
			 pro=new Properties();
			 fis=new FileInputStream("C:\\FrameWork\\Telecommunication\\ConfigurationPropertyFile\\config.properties");
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("not found"  +e.getMessage());
		}
	}

	public static  void SetUp()
	{
		
	
		
		String bro = pro.getProperty("Browser");
		if(bro.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\FrameWork\\Telecommunication\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(	bro.equalsIgnoreCase("FireFox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\FrameWork\\Telecommunication\\Broswers\\geckodriver.exe");
				driver=new FirefoxDriver();
			
		}
		else if(	bro.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\FrameWork\\Telecommunication\\Broswers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
	}
		else
		{
			System.out.println("exe file not  found or corrupted");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));
}
}



