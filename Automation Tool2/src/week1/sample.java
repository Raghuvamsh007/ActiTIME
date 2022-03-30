package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sample {  //TEST SCRIPT 4//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter username
		rv1.findElement(By.name("pwd")).sendKeys("manager");//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//check whether customer dropdown is single select or multi select
		//locate dropdown
		WebElement dropdown=rv1.findElement(By.name("customerProject.shownCustomer"));//DROPDOWN MEANS REFERENCE VARIABLE d1
		//create object of select class
		Select s1=new Select(dropdown);
		//use isMultiple() to check whether dropdown is single or multi select
		boolean t1=s1.isMultiple();
		System.out.println(t1);
		//use getOptions().size() to count no of options
		int count=s1.getOptions().size();
		System.out.println(count);
		//Retrieve all options and print it, use getOptions() and getText();
		List<WebElement> l1 = s1.getOptions();
		for(int i=0;i<count;i++)
		{
			 String options=l1.get(i).getText();
			 System.out.println(options);
			 
			 
		}
		
		

	}

}
