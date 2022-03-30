package testNGexample1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateProject extends A
{
	@BeforeMethod               //3
	public void retrieveTitile()
	{
		System.out.println("create project title is retrieved");
	}
	@Test             //4
	public void testCreateProject()
	{
		System.out.println("project is created successfully");
	}
	@AfterMethod  //5
	public void displaySuccessMsg()
	{
		System.out.println("Displayed success msg of create project");
	}

}
