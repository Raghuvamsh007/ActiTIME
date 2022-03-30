package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 {//TEST SCRIPT 5

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter username
		rv1.findElement(By.name("pwd")).sendKeys("manager");//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//click on reports
		rv1.findElement(By.linkText("Reports")).click();
		//locate  dropdown and store address
		WebElement dropdown=rv1.findElement(By.name("users"));
		//create class object and pass the address
		Select s1=new Select(dropdown);
		//check single select or multi select
		boolean t1=s1.isMultiple();
		if(t1)
		{
			s1.selectByIndex(0);
			s1.selectByIndex(1);
			s1.selectByIndex(2);
			s1.deselectByIndex(0);
			s1.deselectByIndex(1);
		}
		else
		{
			System.out.println("error message");
		}
		
		
		

	}

}
