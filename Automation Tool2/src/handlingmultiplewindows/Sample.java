package handlingmultiplewindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {//TEST CASE 23

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
		//Click on calendar icon
		rv1.findElement(By.xpath("//img[@alt='Click Here to Pick up the date']")).click();
		//A new window is opened and calendar page will be displayed
		//select a date from a calendar
		//STEP 1// For main page control use browserconrol.getWindowHandle();
		String mainwindow = rv1.getWindowHandle();
		//STEP// To enter in to a child page we are using a method called browsercontrol.getWindowHandles();
		Set<String> a1 = rv1.getWindowHandles();
		for(String s:a1)
		{
			if(s.equals (mainwindow))
			{
				
			}
			else
			{
				rv1.switchTo().window(s);
				break;
			}
		}
			
			rv1.findElement(By.xpath("//span[text()='calendarCurrentMonthWorkingDay']")).click();
			rv1.switchTo().window(mainwindow);
		

		}			
				
	}

