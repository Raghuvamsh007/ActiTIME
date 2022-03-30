package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample6 {//TEST SCRIPT 10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter username
		rv1.findElement(By.name("pwd")).sendKeys("manager");//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//click on projects and customers
		rv1.findElement(By.linkText("Projects & Customers")).click();
		//click on  Archive Selected customer and projects button
		rv1.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
		//call alert(); method and store it in a1 i.e; a1 is alert type
		Alert a1=rv1.switchTo().alert();
		//Retrieve the text
		String s=a1.getText();
		//print it console
		System.out.println(s);
		//click on ok
		a1.accept();
		//close the browser
		rv1.close();
		
		

	}

}
