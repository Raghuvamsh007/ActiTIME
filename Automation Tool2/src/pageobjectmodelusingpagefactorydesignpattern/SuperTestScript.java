package pageobjectmodelusingpagefactorydesignpattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SuperTestScript
{
	public static WebDriver driver;
	@BeforeTest
	public void openBRowser()
	{
		String browser="chrome";
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
			driver= new FirefoxDriver();//open browser
			driver.get("http://raghu-pc:81/login.do");//enter url
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\QSPIDERS\\web drivers/chromedriver.exe");
			driver=new ChromeDriver();//open browser
			driver.get("http://raghu-pc:81/login.do");//enter url
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		}
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	@BeforeClass
	public void loginToActiTime()
	{
		driver.findElement(By.name("username")).sendKeys("admin");//enter username
		driver.findElement(By.name("pwd")).sendKeys("manager");//enter password
		driver.findElement(By.xpath("//input[@type='submit']")).click();//click on login
	}
	@AfterClass
	public void logoutFromActitime()
	{
		driver.findElement(By.className("logoutImg")).click();// click on logout
	}
}
