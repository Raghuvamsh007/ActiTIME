package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample15 {//EXAMPLE PROGRAM FOR COPY PASTE////TEST SCRIPT 19

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter user name
		//copy user name i.e; admin and paste it in password text field, click on ENTER
		rv1.findElement(By.name("username")).sendKeys(Keys.CONTROL+"a");//first select
		rv1.findElement(By.name("username")).sendKeys(Keys.CONTROL+"c");//copy
		rv1.findElement(By.name("username")).sendKeys(Keys.CONTROL+"v"+Keys.ENTER);//paste and ENTER
		
		//The above  code is enter in one line as...
		//rv1.findElement(By.name("username")).sendKeys("admin"+Keys.CONTROL+"a"+Keys.CONTROL+"c"+Keys.CONTROL+"v"+Keys.ENTER);
		
		
		

	}

}
