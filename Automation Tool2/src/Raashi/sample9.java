package Raashi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sample9 //TEST SCRIPT 3
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();
		rv1.get("http://raghu-pc:81/login.do");
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;
		rv1.findElement(By.name("username")).sendKeys("admin");
		rv1.findElement(By.name("pwd")).sendKeys("manager");
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		WebElement d1= rv1.findElement(By.name("customerProject.shownCustomer"));//click on customer dropdown
		Select s1=new Select(d1);//same code
		s1.selectByIndex(1); //same code
		List<WebElement> l1 = s1.getOptions();
		for(int i=0;i<=3;i++)                                     //(or)System.out.println(l1.get(0).getText());
		{                                                        //(or)System.out.println(l1.get(1).getText());
		  System.out.println(l1.get(i).getText());              //(or)System.out.println(l1.get(2).getText());
		}                                                      //(or)System.out.println(l1.get(3).getText());
		
		
			
		
		
		

	}

}
