package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample10 {//TEST SCRIPT 14

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter username
		rv1.findElement(By.name("pwd")).sendKeys("manager");//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//perform right click action projects and customers
		//store the address in a web element variable 
		WebElement projectAndcustomerAddress=rv1.findElement(By.linkText("Projects & Customers"));
		//Create object of Actions class
		//pass the browser control to the Actions class object
		Actions a1=new Actions(rv1);
		//using the reference variable of Actions class, call contextClick(); method and pass web element address as an argument
		//call .build(); and .perform(); methods
		a1.contextClick(projectAndcustomerAddress).build().perform();
		
	}

}
