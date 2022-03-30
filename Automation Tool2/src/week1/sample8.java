package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample8 {//TEST SCRIPT 12

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
		//click on add new customer
		rv1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		//enter customer name
		rv1.findElement(By.name("name")).sendKeys("starc");
		//click on Archives tab,Hidden division popup will be displayed
		rv1.findElement(By.linkText("Archives")).click();
		//Retrieve the text  from all the buttons in the hidden division popup
		String s1=rv1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).getAttribute("value");
		System.out.println(s1);
		//Retrieve the text from Remain on the page
		String s2=rv1.findElement(By.xpath("//input[@value='Remain on the Page']")).getAttribute("value");
		System.out.println(s2);
		//click on cancel customer creation and proceed button
		rv1.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
		// click on logout
		rv1.findElement(By.className("logoutImg")).click();

	}

}
