package com.acti.Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.acti.Base.DriverScript;

public class Utility2 extends DriverScript 
{
	public static  void HighLightElement(WebElement we )
	{
	JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].setAttribute('style','background:yellow; border: 2px solid red;');", we);
    
  
	 }
    		
}
