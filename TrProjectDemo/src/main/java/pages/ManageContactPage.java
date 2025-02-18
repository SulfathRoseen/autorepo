package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.RandomUtility;



public class ManageContactPage {
	public WebDriver driver;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']") WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement buttonField;
	@FindBy(xpath="//a[@role='button']") WebElement editButtonField;
	@FindBy(xpath="//input[@id='phone']") WebElement phoneNumberField;
	@FindBy(xpath="//input[@id='email']") WebElement emailAddressField;
	@FindBy(xpath="//textarea[@name='address']") WebElement addressField;
	@FindBy(xpath="//textarea[@name='del_time']") WebElement deliveryTimeField;
	@FindBy(xpath="//input[@name=\"del_limit\"]") WebElement deliverylimitField;
	@FindBy(xpath="//button[@name='Update']") WebElement updateOnbuttonField;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertMessageField;

	public ManageContactPage navigate(String url	)
	{
		driver.navigate().to(url);
		return this;
	}
	public ManageContactPage clickOnEditButton()
	{
		editButtonField.click();
		return this;
	}
	public ManageContactPage enterPhoneNumberOnPhoneNumberField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String number=randomUtility.fakerPhoneNumber();
		phoneNumberField.sendKeys(number);
		return this;
	}
	public ManageContactPage enterEmailAddressOnEmailAdressField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String emailId=randomUtility.fakerEmail();
		emailAddressField.sendKeys(emailId);
		return this;
	}
	public ManageContactPage enterAddressOnAddressField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String address=randomUtility.fakerAddress();
		addressField.sendKeys(address);
		return this;
	}
	public ManageContactPage enterTimeOnDeliveryTimeField()
	{
		RandomUtility randomUtility=new RandomUtility();
		int time=randomUtility.fakerTime();
		deliveryTimeField.sendKeys(String.valueOf(time));
		return this;
	}
	public ManageContactPage enterDeliveryLimitOnDeliveryLimitField()
	{
		RandomUtility randomUtility=new RandomUtility();
		int limit=randomUtility.fakerNumber();
		deliverylimitField.sendKeys(String.valueOf(limit));
		return this;

	}
	public ManageContactPage clickTheUpdateButton()
	{

		updateOnbuttonField.click();
		return this;

	}	
	public boolean alertMessageAppears()
	{
		boolean isAlertDisplayed=alertMessageField.isDisplayed();
		return isAlertDisplayed;
	}
}
