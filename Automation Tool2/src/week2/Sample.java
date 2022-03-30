package week2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Sample {//TEST SCRIPT 20

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		// STEP 1) Create Object Of Event Firing Web Driver Class
		// STEP 2) Pass The Browser Control To Event Firing Web Driver Object
		EventFiringWebDriver e1=new EventFiringWebDriver(rv1);
		// STEP 3) Using Reference Variable, Call getScreenshotAs(); Method
		// STEP 4) Pass outputType.FILE as an Argument, For getScreenshotAS Method
		// STEP 5) Store The Address Of Screenshot In aVariable of FILE Type
		File f1=e1.getScreenshotAs(OutputType.FILE);
		File f2=new File("D:\\scrrenshots\\login.jpg");//In "D" Drive it creates one folder i.e; IN that folder only Image will be saved(i.e; it is implicitly it creates one folder)
		// To Transfer The Screenshot From Source Location To Target Location, We Should Use One Method Called as moveFile(  ,   );
		FileUtils.moveFile(f1, f2);

	}

}
