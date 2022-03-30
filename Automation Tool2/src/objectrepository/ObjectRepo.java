package objectrepository;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepo 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\Java Project Work Space\\Automation Tool\\src\\objectrepository\\app.properties");
		Properties p1=new Properties();
		p1.load(fis);
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//open browser
		driver.get("http://raghu-pc:81/login.do");//enter url
		String unloc=p1.getProperty("untf");
		String pwloc=p1.getProperty("pwtf");
		String logloc=p1.getProperty("login");
		driver.findElement(By.name(unloc)).sendKeys("admin");
		driver.findElement(By.name(pwloc)).sendKeys("manager");
		driver.findElement(By.xpath(logloc)).click();
	}

}
