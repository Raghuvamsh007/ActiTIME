package testNgAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class OpenGoogle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//open browser
		driver.get("https://www.google.com/");
		try
		{
			Assert.assertEquals("Google", driver.getTitle());
			System.out.println("Test pass");
		}
		catch(AssertionError rv)
		{
			System.out.println("Test fail");
		}

	}

}
