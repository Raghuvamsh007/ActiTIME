package datadrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateTask 
{
	@Test
	public void testCreateTask() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//WRITE CODE TO READ DATA
		String url = ExcelOperation.readData("Sheet5", 1, 0);
		String username = ExcelOperation.readData("Sheet5",1, 1);
		String password = ExcelOperation.readData("Sheet5",1, 2);
		String taskname = ExcelOperation.readData("Sheet5",1, 3);
		String expected = ExcelOperation.readData("Sheet5",1, 4);
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver f1= new FirefoxDriver();
		f1.get(url);
		f1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) ;//synchronization
		f1.findElement(By.name("username")).sendKeys(username);//enter username
		f1.findElement(By.name("pwd")).sendKeys(password);//enter password
		f1.findElement(By.xpath("//input[@type='submit']")).click();//click on login	
		//click on add new tasks
		f1.findElement(By.xpath("//input[@value='Add New Tasks']")).click();
		//select the customer from dropdown
		WebElement dropdown1=f1.findElement(By.name("customerId"));
		//create object of select class
		Select s1=new Select(dropdown1);
		s1.selectByIndex(2);
		//select the project from the dropdown
		WebElement dropdown2=f1.findElement(By.name("projectId"));
		//create object of select class
		Select s2=new Select(dropdown2);
		s2.selectByIndex(2);
		//enter the task in a task text field
				f1.findElement(By.name("task[0].name")).sendKeys(taskname);
				//select billable from the dropdown
				WebElement dropdown3=f1.findElement(By.name("task[0].billingType"));
				//create object of select class
				Select s3=new Select(dropdown3);
				s3.selectByIndex(1);
				//click on create tasks
				f1.findElement(By.xpath("//input[@value='Create Tasks']")).click();
				//Retrieve the success message 
				String actualresult=f1.findElement(By.className("successmsg")).getText();
				ExcelOperation.writeData("Sheet5", 1, 5, actualresult);
				if(expected.equals(actualresult))
				{
					ExcelOperation.writeData("Sheet5",1, 6,"pass");
				}
				else
				{
					ExcelOperation.writeData("Sheet5",1, 6,"fail");
				}
	}

}
