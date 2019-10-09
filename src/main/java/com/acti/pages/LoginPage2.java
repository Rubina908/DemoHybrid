package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.Utility2;

public class LoginPage2 extends DriverScript {
	
	//**********************Object Repository********************************************
	
	@FindBy(xpath="//div[contains(@class,'atLogo')]") WebElement verifyinglogo ;
	@FindBy(id="headerContainer") WebElement VerifyingTheText ;
	@FindBy(id="username") WebElement EnterTheUserName ;
	@FindBy(name="pwd") WebElement EnterThePassword ;
	@FindBy(id="loginButton") WebElement Button;
	//***************************pagefactory****************************
	
	public LoginPage2()
	{
		PageFactory.initElements(driver, LoginPage2.this);
	}
	//************************action**********************
	public boolean logovalidation()
	{
		
		Utility2.HighLightElement(verifyinglogo);
		return verifyinglogo.isDisplayed();
	}
	public String validatingTheText()
	{
		Utility2.HighLightElement(VerifyingTheText);
		return VerifyingTheText.getText();
	}
	 public void EnterLoginCredential(String Username,String Password)
	 {
		 Utility2.HighLightElement(EnterTheUserName);
		 EnterTheUserName.sendKeys( Username);
		 Utility2.HighLightElement(EnterThePassword);
		 EnterThePassword.sendKeys( Password);
		 Button.click();
		 
	 }
	
}
