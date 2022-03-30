package supertestscriptprogram;

import org.junit.Test;
import org.openqa.selenium.By;

public class CreateCustomer extends SuperTestScript
{
	@Test
	public void testCreateCustomer()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();//click on projects and customers
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();//click on add new customer
		driver.findElement(By.name("name")).sendKeys("raghu234");//enter customer name
		driver.findElement(By.name("createCustomerSubmit")).click();//click on create customer button
	}
	

}
