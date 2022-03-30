package supertestscriptprogram;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateProject extends SuperTestScript
{
	@Test
	public void testCreateProject()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();//click on projects and customers
		driver.findElement(By.xpath("//input[@value='Add New Project']")).click();//click on add new project
		WebElement d1= driver.findElement(By.name("customerId"));//select the appropriate customer from the dropdown
		Select s1=new Select(d1);
		s1.selectByVisibleText("raghu234");
		driver.findElement(By.name("name")).sendKeys("styris");//enter project name
		driver.findElement(By.xpath("//input[@value='Create Project']")).click();//click on create project

		
	}

}
