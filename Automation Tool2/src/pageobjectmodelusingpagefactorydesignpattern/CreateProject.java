package pageobjectmodelusingpagefactorydesignpattern;

import org.testng.annotations.Test;

public class CreateProject extends SuperTestScript
{
	@Test
	public void testCreateProject()
	{
		//STEP 1) CREATE OBJECT OF WEBPAGE CLASSES
		OpenTaskPage otp= new OpenTaskPage();
		ActiveProjectsAndCustomersPage apcp= new ActiveProjectsAndCustomersPage();
		AddNewProjectPage anpp=new AddNewProjectPage();
		
		//STEP 2) CONVERT TESTCASE IN TO TESTSCRIPT
		otp.clickOnProjectsAndCustomersLink();
		apcp.clickOnAddNewProjectButton();
		anpp.SelectCustomerFromDropDown("pat cummins");
		anpp.enterProjectNameInProjectNameTextField("varuntej");
		anpp.clickOnCreateProjectButton();
		String s = apcp.retrieveSuccessMessage();
		System.out.println(s);
	}

}
