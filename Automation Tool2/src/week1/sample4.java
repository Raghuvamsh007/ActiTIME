package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sample4 {//TEST SCRIPT 8

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
		//click on add new project
		rv1.findElement(By.xpath("//input[@value='Add New Project']")).click();
		//select the appropriate customer from the dropdown
		WebElement d1= rv1.findElement(By.name("customerId"));
		Select s1=new Select(d1);//same code
		s1.selectByIndex(1); //same code
		//enter project name
		rv1.findElement(By.name("name")).sendKeys("btech project");
		//click on create project
		rv1.findElement(By.xpath("//input[@value='Create Project']")).click();
		//To retrieve success message, we should go for getText();
		//STEPS are step 1) locate text which you want to retrieve
		          //step 2) use getText();
				  //step 3) store text in a string variable
		String s=rv1.findElement(By.className("successmsg")).getText();
				  //step 4) print the variable
		System.out.println(s);
		// click on logout
		rv1.findElement(By.className("logoutImg")).click();
			
		
		
		


	}

}
