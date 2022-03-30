package parameterisation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample//@PARAMETERS WITH XML FILE(WITH SINGLE ARGUMENT)
{
	@Parameters("t1")
	@Test
	public void testSample(int a)
	{
		System.out.println("value is "+a);
	}
		
	

}
