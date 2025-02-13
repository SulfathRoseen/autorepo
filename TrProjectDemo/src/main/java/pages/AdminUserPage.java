package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import utilities.PageUtility;
import utilities.RandomUtility;
import utilities.WaitUtility;

public class AdminUserPage {

	public WebDriver driver;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[@type='text']") WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement buttonField;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButtonField;
	@FindBy(xpath="//input[@id='username']") WebElement userNameFieldOnAdminUser;
	@FindBy(xpath="//input[@id='password']") WebElement passWordFieldOnAdminUser;
	@FindBy(xpath="//select[@id='user_type']") WebElement dropDownField;
	@FindBy(xpath="//button[@name='Create']") WebElement saveButtonField;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertMessageField;
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement searchButtonField;
	@FindBy(xpath="//input[@id='un']") WebElement userNameOnSearchButtonField;
	@FindBy(xpath="//select[@id='ut']") WebElement dropDownOnSearchButtonField;
	@FindBy(xpath="//button[@name='Search']") WebElement buttonOnSearchButtonField;
	@FindBy(xpath="//td[text()='sulfath']") WebElement pageAppearsOnSearchButtonField;
	
	public void navigate(String url)
	{
		driver.navigate().to(url);
	}

	public void enterFakeUserNameOnUserNameField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String userName=randomUtility.fakerFullName();
		userNameFieldOnAdminUser.sendKeys(userName);	
	}

	public void enterFakePasswordOnPasswordField()
	{
		RandomUtility randomUtility=new RandomUtility();
	String passWord=	randomUtility.fakerPassword();
		passWordFieldOnAdminUser.sendKeys(passWord);
	}
	
	
	public void newButtonClick()
	{
		newButtonField.click();
	}

	public void userTypeOnDropDownField()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectFromDropDownUsingValue(dropDownField, "staff");

	}
	public void clickOnSaveButton()
	{
		WaitUtility waitUtility=new WaitUtility();
		waitUtility.waitCommandsToBeClickable(driver, saveButtonField);
		saveButtonField.click();
	}
	
	public boolean alertMessageAppears()
	{
		boolean alertMessage=alertMessageField.isDisplayed();
		return alertMessage;
	}
	public void enterUserNameOnUserNameField(String username)
	{
		userNameOnSearchButtonField.sendKeys(username);
	}
	
	public void clickOnsearchButton()
	{
		searchButtonField.click();
	}


	public void dropDownOnSearchButton()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectFromDropDownUsingValue(dropDownOnSearchButtonField, "staff");


	}
	public void buttonOnSearchClick()
	{
		buttonOnSearchButtonField.click();
	}
	public boolean pageAppearsOnSearch()
	{
		boolean pageAppears=pageAppearsOnSearchButtonField.isDisplayed();
		return pageAppears;
	}


}