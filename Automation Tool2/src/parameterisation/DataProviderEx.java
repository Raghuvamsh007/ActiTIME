package parameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx //DATA PROVIDER PROGRAM
{
	@DataProvider(name="testdata")
	public Object [] [] getData()
	{
		Object [] [] rv1=new Object[3][2];
		rv1[0][0]="admin1";
		rv1[0][1]="mana ger1";
		rv1[1][0]="admin@#";
		rv1[1][1]="mana#$%";
		
		rv1[2][0]="admin1@34";
		rv1[2][1]="mana ger1@123";
		return rv1;
		
	}
	@Test(dataProvider="testdata")
	public void testLoginlogout(String username, String pwd)
	{
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("http://raghu-pc:81/login.do");//enter url
		rv1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		rv1.findElement(By.name("username")).sendKeys(username);//enter username
		rv1.findElement(By.name("pwd")).sendKeys(pwd);//enter password
		rv1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
	}

}
