package pageobjectmodelusingpagefactorydesignpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage
{
	@FindBy(name="customerId")
	private WebElement CustomerDropdown;
	
	@FindBy(name="name")
	private WebElement ProjectNameTextField;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	
	public AddNewProjectPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void SelectCustomerFromDropDown(String customerName)
	{
		Select s1=new Select(CustomerDropdown);
		s1.selectByVisibleText(customerName);
	}
	public void enterProjectNameInProjectNameTextField(String projectName)
	{
		ProjectNameTextField.sendKeys(projectName);
	}
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
	}

}
