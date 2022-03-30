package datadrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateUser
{
	@Test
	public void testCreateUser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//WRITE CODE TO READ DATA
		String url = ExcelOperation.readData("Sheet3", 1, 0);
		String username = ExcelOperation.readData("Sheet3",1, 1);
		String password = ExcelOperation.readData("Sheet3",1, 2);
		String customername = ExcelOperation.readData("Sheet3",1, 3);
		String expected = ExcelOperation.readData("Sheet3",1, 4);
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver f1= new FirefoxDriver();
		f1.get(url);
		f1.findElement(By.name("username")).sendKeys(username);//enter username
		f1.findElement(By.name("pwd")).sendKeys(password);//enter password
		f1.findElement(By.xpath("//input[@type='submit']")).click();//click on login
		f1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		//click on projects and customers
				f1.findElement(By.linkText("Projects & Customers")).click();
				//click on add new customer
				f1.findElement(By.xpath("//input[@value='Add New Customer']")).click();
				//enter customer name
				f1.findElement(By.name("name")).sendKeys(customername);
				//click create button
				f1.findElement(By.name("createCustomerSubmit")).click();
				//To retrieve success message, we should go for getText();
				//STEPS are step 1) locate text which you want to retrieve
				          //step 2) use getText();
						  //step 3) store text in a string variable
				String actualresult=f1.findElement(By.className("successmsg")).getText();
				ExcelOperation.writeData("Sheet3", 1, 5, actualresult);
				if(expected.equals(actualresult))
				{
					ExcelOperation.writeData("Sheet3",1, 6,"pass");
				}
				else
				{
					ExcelOperation.writeData("Sheet3",1, 6,"fail");
				}
						  
		
		
	}

}
