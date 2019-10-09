package com.acti.Helper;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.acti.Base.DriverScript;

public class ScreenShot2 extends DriverScript{

	public static String takeSnapShot(WebDriver driver,String ScreenshootName) throws Exception
	{
		
		
		/*// Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
		 
        //Convert web driver object to TakeScreenshot
*/
		String dateName= new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		//takescreen is an interface it will help us to  take screenshot when ever testcase fails
        TakesScreenshot scrShot =(TakesScreenshot)driver;

        //After execution of test case you would see one folder Filedtestcases
        //under src folder

                File source=scrShot.getScreenshotAs(OutputType.FILE);
      String destination = System.getProperty("user.dir")+"/FailedTest/"+ ScreenshootName+dateName+".png";
               
            //Move image file to new destination

                File FinalDestionFile=new File(destination);
                

                //Copy file at destination
              //Copy file at destination

                FileUtils.copyFile(source, FinalDestionFile);


return 	destination;
	
	}

}



