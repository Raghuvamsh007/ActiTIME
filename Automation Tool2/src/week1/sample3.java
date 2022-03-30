package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample3 {//TEST SCRIPT 7

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys("admin");//enter username
		rv1.findElement(By.name("pwd")).sendKeys("manager");//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		rv1.findElement(By.linkText("Users")).click();//click on users
		rv1.findElement(By.xpath("//input[@value='Add New User']")).click();//click on add new user
		//enter details in mandatory fields
		rv1.findElement(By.name("username")).sendKeys("raghav");
		rv1.findElement(By.name("passwordText")).sendKeys("munna");
		rv1.findElement(By.name("passwordTextRetype")).sendKeys("munna");
		rv1.findElement(By.name("firstName")).sendKeys("kolanu");
		rv1.findElement(By.name("lastName")).sendKeys("raghav");
		//click on create user button
		rv1.findElement(By.xpath("//input[@value='   Create User   ']")).click(); 
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
