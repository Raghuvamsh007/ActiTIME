package datadrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginLogoutTc_01 
{
	@Test
	public void testLoginLogoutTc_01() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//WRITE CODE TO READ DATA
		String url = ExcelOperation.readData("Tc_01", 1, 0);
		String username = ExcelOperation.readData("Tc_01",1, 1);
		String password = ExcelOperation.readData("Tc_01",1, 2);
		String expected = ExcelOperation.readData("Tc_01",1, 3);
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver f1= new FirefoxDriver();
		f1.get(url);
		f1.findElement(By.name("username")).sendKeys(username);//enter username
		f1.findElement(By.name("pwd")).sendKeys(password);//enter password
		f1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		f1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		String actualresult = f1.getTitle();
		ExcelOperation.writeData("Tc_01", 1, 4, actualresult);
		if(expected.equals(actualresult))
		{
			ExcelOperation.writeData("Tc_01",1, 5,"pass");
		}
		else
		{
			ExcelOperation.writeData("Tc_01",1, 5,"fail");
		}
	}

}
