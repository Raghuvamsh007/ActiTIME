package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {//FRAME ASSIGNMENT TEST SCRIPT

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("file:///C:/New%20folder/Desktop/FRAME%20ASSIGNMENT/frame.html");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//synchronization
		//Entering The Name
		rv1.findElement(By.id("t1")).sendKeys("raghu");
		//Entering in to Frame Element
		rv1.switchTo().frame("frame1");
		//Entering the phone number in Frame Element
		rv1.findElement(By.xpath("//input[@type='text']")).sendKeys("12234546");
		//Transfer the control from Frame Page To Main Page
		rv1.switchTo().defaultContent();
		//Entering The Password
		rv1.findElement(By.id("t2")).sendKeys("ranga");
		//Entering in to Frame Element of Dropdown
		rv1.switchTo().frame("frame2");
		//Transfer the control from Frame Page To Main Page
		rv1.switchTo().defaultContent();
		//Entering the Email
		rv1.findElement(By.id("t3")).sendKeys("abcd@gmail.com");
		//Entering in to Frame Element
		rv1.switchTo().frame("frame3\"");
		//Entering The Radio button in Frame Element
		rv1.findElement(By.xpath("//input[@type='radio']")).click();
		//Transfer the control from Frame Page To Main Page
		rv1.switchTo().defaultContent();

	}   

}
