package pageobjectmodelusingpagefactorydesignpattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage 
{
	@FindBy(name="name")
	private WebElement customerNameTextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	public AddNewCustomerPage()
	{
		PageFactory.initElements(SuperTestScript.driver, this);
	}
	public void enterCustomerNameInCustomerNameTextField(String name)
	{
		customerNameTextField.sendKeys(name);
	}
	public void clcikOnCreateCustomerButton()
	{
		createCustomerButton.click();
	}

}
