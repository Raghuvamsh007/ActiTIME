package Raashi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample6 //program 2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();
		rv1.get("http://raghu-pc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
		String s = rv1.getTitle();//Retrieve title of login page....
		System.out.println(s);//print it on console......
		rv1.findElement(By.name("username")).sendKeys("admin");
		rv1.findElement(By.name("pwd")).sendKeys("manager");
		rv1.findElement(By.xpath("//input[@type='submit']")).click();
		String s1=rv1.getTitle();//Retrieve title of home page.....
		System.out.println(s1);//print it on console......
		rv1.findElement(By.className("logoutImg")).click();
		rv1.close();
		
		
	}

}
