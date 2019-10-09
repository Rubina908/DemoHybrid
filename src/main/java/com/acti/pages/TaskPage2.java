package com.acti.pages;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.Base.DriverScript;
import com.acti.Helper.Utility2;

public class TaskPage2 extends  DriverScript  {
	
	WebDriverWait wdw;
	
	@FindBy(xpath="//div[contains(@id,'tasks')]") WebElement task ;

	@FindBy(xpath="//div[text()='Add New']") WebElement AddButton ;
	//@FindBy(xpath="//div[text()='+ New Customer']") WebElement NewCustomer;
	@FindBy(xpath="//div[text()='+ New Tasks']") WebElement NewTask;
	
	/*@FindBy(xpath="(//div[contains(text(),'- Select Customer -')]") WebElement Dropdown;
	@FindBy(xpath="(//div[text()='- New Customer -']")WebElement Selectnewcustomer;
	@FindBy(xpath="(//div[text()='- Select Project -']") WebElement CustomerTextBox;
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]") WebElement ProjectName;
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]") WebElement TaskName;
	@FindBy(xpath="//div[text()='  Create Tasks']")WebElement clickTask;*/
	public TaskPage2()
	{
		
		PageFactory.initElements(driver,this);
	}
public void TaskButton() throws InterruptedException
{
 Thread.sleep(2000);
	 wdw=new WebDriverWait(driver,10);
	wdw.until(ExpectedConditions.elementToBeClickable(task));
	Thread.sleep(5000);
	Utility2.HighLightElement(task);
	task.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 AddButton.click();
	  NewTask.click();
}
/*public void CreateNewTask(String customer,String project,String Task) throws InterruptedException
{

 wdw=new WebDriverWait(driver,10);
 wdw.until(ExpectedConditions.elementToBeClickable(Dropdown));
	Utility.HighLightElement(Dropdown);
 Thread.sleep(5000);
	Dropdown.click();
	Selectnewcustomer.click();
	
	CustomerTextBox.sendKeys(customer);
	 ProjectName.sendKeys(project);
	 TaskName.sendKeys(Task);
	 clickTask.click();
}*/
}
