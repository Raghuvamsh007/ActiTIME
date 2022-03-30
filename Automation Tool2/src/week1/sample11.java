package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample11 {//TEST SCRIPT 15

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter username
		rv1.findElement(By.name("pwd")).sendKeys("manager");//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//Move the cursor to settings
		WebElement settingsAddress=rv1.findElement(By.linkText("Settings"));
		//Creating actions class object and double click on settings
		Actions a1=new Actions(rv1);
		//By using the reference variable of Actions class, call doubleClick(); method
		//call .build(); and .perform(); methods
		a1.moveToElement(settingsAddress).doubleClick().build().perform();
		//click on Add new Billing type
		rv1.findElement(By.xpath("//input[@value='Add New Billing Type']")).click();
		//Enter Billing type name
		rv1.findElement(By.name("name0")).sendKeys("kgf2");
		//click on create Billing type
		rv1.findElement(By.xpath("//input[@value='Create Billing Type(s)']")).click();
		//Retrieve success message
		String s=rv1.findElement(By.className("successmsg")).getText();
		//print it on console
		System.out.println(s);
		//Select the billing type that you created
		rv1.findElement(By.linkText("kgf2")).click();
		//click on Delete this billing type
		rv1.findElement(By.xpath("//input[@value='Delete this billing type']")).click();
		//A popup message will be displayed
		Alert a2=rv1.switchTo().alert();
		//Click on OK button
		a2.accept();
		//Retrieve success message 
		String s1=rv1.findElement(By.className("successmsg")).getText();
		//print it console
		System.out.println(s1);
		//click on logout
		rv1.findElement(By.className("logoutImg")).click();
		
		
		
		
	}

}
