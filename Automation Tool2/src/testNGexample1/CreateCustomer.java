package testNGexample1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCustomer extends A
{
	@BeforeMethod        //3
	public void retrieveTitile()
	{
		System.out.println("create customer title is retrieved");
	}
	@Test             //4
	public void testCreateCustomer()
	{
		System.out.println("customer is created successfully");
	}
	@AfterMethod        //5
	public void displaySuccessMsg()
	{
		System.out.println("Displayed success msg of create customer");
	}

}
