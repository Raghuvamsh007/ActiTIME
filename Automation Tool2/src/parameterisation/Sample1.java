package parameterisation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 //@PARAMETERS WITH XML FILE(WITH TWO ARGUMENT)
{
	@Parameters({"t1","t2"})
	@Test
	public void testSample(double a,int b)
	{
		System.out.println("value is "+a);
		System.out.println("value is "+b);
	}

}
