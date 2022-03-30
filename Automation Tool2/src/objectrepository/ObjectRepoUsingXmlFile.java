package objectrepository;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepoUsingXmlFile 
{
	public static void main(String[] args) throws DocumentException 
	{
		SAXReader s1=new SAXReader();
		Document d1 = s1.read("D:\\Java Project Work Space\\Automation Tool\\src\\objectrepository\\sample.xml");
		String unLoc=d1.selectSingleNode("//login_test/untf").getText();
		String pwLoc=d1.selectSingleNode("//login_test/pwtf").getText();
		String loginLoc=d1.selectSingleNode("//login_test/login").getText();
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();//open browser
		driver.get("http://raghu-pc:81/login.do");//enter url
		driver.findElement(By.name(unLoc)).sendKeys("admin");
		driver.findElement(By.name(pwLoc)).sendKeys("manager");
		driver.findElement(By.xpath(loginLoc)).click();
		

	}

}
