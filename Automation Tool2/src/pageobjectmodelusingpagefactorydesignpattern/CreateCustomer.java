package pageobjectmodelusingpagefactorydesignpattern;

import org.testng.annotations.Test;

public class CreateCustomer extends SuperTestScript
{
	@Test
	public void testCreateCustomer()
	{
		//STEP 1) CREATE OBJECT OF WEBPAGE CLASSES
		OpenTaskPage otp= new OpenTaskPage();
		ActiveProjectsAndCustomersPage apcp= new ActiveProjectsAndCustomersPage();
		AddNewCustomerPage ancp= new AddNewCustomerPage();
		
		//STEP 2) CONVERT TESTCASE IN TO TESTSCRIPT
		otp.clickOnProjectsAndCustomersLink();
		apcp.clickOnAddNewCustomerButton();
		ancp.enterCustomerNameInCustomerNameTextField("pat cummins");
		ancp.clcikOnCreateCustomerButton();
		String s=apcp.retrieveSuccessMessage();
		System.out.println(s);
		
	}

}
