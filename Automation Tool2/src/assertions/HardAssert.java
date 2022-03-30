package assertions;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class HardAssert
{
	String var1="hello";
	@Test
	public void testHardAssert()
	{
		Assert.assertEquals("HardAssertion","HardAssertion");
		Assert.assertEquals(true,true);
		Assert.assertEquals(var1,"hello");
		System.out.println("last statement executed successfully");
		
	}
	
}


	


