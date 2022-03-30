package Raashi;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();
		rv1.get("file:///C:\\New folder\\Desktop\\New folder/untitled1.html");
		rv1.findElement(By.cssSelector("input[value='login']")).click();
		rv1.close();
		
	}

}
