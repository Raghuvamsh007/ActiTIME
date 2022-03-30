package testNgGroupExexution;

import org.testng.annotations.Test;

public class C {
	@Test(groups="ft")
	public void functionalTest()
	{
		System.out.println("functional testing is completed");
	}
	@Test(groups="IT")
	public void integrationTest()
	{
		System.out.println("integration testing is completed");
	}
	@Test(groups="st")
	public void systemTest()
	{
		System.out.println("system testing is completed");
	}

}
