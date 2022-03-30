package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sample9 {//TEST SCRIPT 13

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter username
		rv1.findElement(By.name("pwd")).sendKeys("manager");//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		//click on add new tasks
		rv1.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		//select the customer from dropdown
		WebElement dropdown1=rv1.findElement(By.name("customerId"));
		//create object of select class
		Select s1=new Select(dropdown1);
		s1.selectByIndex(4);
		//select the project from the dropdown
		WebElement dropdown2=rv1.findElement(By.name("projectId"));
		//create object of select class
		Select s2=new Select(dropdown2);
		s2.selectByIndex(1);
		//enter project name
		rv1.findElement(By.name("projectName")).sendKeys("jspiders");
		//enter the task in a task text field
		rv1.findElement(By.name("task[0].name")).sendKeys("login page");
		//select billable from the dropdown
		WebElement dropdown3=rv1.findElement(By.name("task[0].billingType"));
		//create object of select class
		Select s3=new Select(dropdown3);
		s3.selectByIndex(1);
		//click on create tasks
		rv1.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		//Retrieve the success message 
		String s4=rv1.findElement(By.className("successmsg")).getText();
		//print it on console
		System.out.println(s4);
		//click on customer dropdown
		WebElement dropdown4=rv1.findElement(By.name("customerProject.shownCustomer"));
		//create object of select class
		Select s5=new Select(dropdown4);
		s5.selectByIndex(3);
		//click on show tasks
		rv1.findElement(By.xpath("//input[@value='Show Tasks']")).click();
		//click on task from the list
		rv1.findElement(By.linkText("login page")).click();
		//delete the task
		rv1.findElement(By.xpath("//input[@value='Delete This Task']")).click();
		//To retrieve text from popup call alert(); method and store it in a1 i.e; a1 is alert type
		Alert a1=rv1.switchTo().alert();
		//Click on OK button
		a1.accept();
		//Retrieve the success message 
		String s6=rv1.findElement(By.className("successmsg")).getText();
		//print it on console
		System.out.println(s6);
		
		
		
		
		
		
		
	}

}
