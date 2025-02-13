package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.RandomUtility;

public class ManageFooterTextPage {

	public WebDriver driver;

	public  ManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement buttonField;
	@FindBy(xpath="//a[@role='button']//following::i[@class='fas fa-edit']") WebElement editField;
	@FindBy(xpath="//textarea[@name='address']") WebElement addressField;
	@FindBy(xpath="//input[@id='email']") WebElement emailField;
	@FindBy(xpath="//input[@id='phone']") WebElement phoneField;
	@FindBy(xpath="//button[@name='Update']") WebElement updateButtonField;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertMessageField;

	public void navigateToUrl(String url)
	{
		driver.navigate().to(url);
	}
	public void clickOnEditButton()
	{
		editField.click();
	}
	public void enterAddressOnAddressField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String address=randomUtility.fakerAddress();
		addressField.sendKeys(address);
	}
	public void enterEmailOnEmailField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String email=randomUtility.fakerEmail();
		emailField.sendKeys(email);
	}
	public void enterPhoneNumberOnPhoneNumberField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String number=randomUtility.fakerPhoneNumber();
		phoneField.sendKeys(number);
	}
	public void clickOnUpdateButtonField()
	{
		updateButtonField.click();
	}
	public boolean alertMessageAppears()
	{
		boolean isAlertDisplayed=alertMessageField.isDisplayed();
		return isAlertDisplayed;
	}


}
