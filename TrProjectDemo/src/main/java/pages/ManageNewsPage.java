package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.RandomUtility;

public class ManageNewsPage {
	public WebDriver driver;

	public  ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[@type='text']") WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement buttonField;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButtonField;
	@FindBy(xpath="//textarea[@id='news']") WebElement newsField;
	@FindBy(xpath="//button[@name='create']") WebElement saveButtonField;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertMessageField;
	
	public void navigate(String url)
	{
		driver.navigate().to(url);
	}
	public void clickOnNewButton()
	{
		newButtonField.click();
	}
	public void enterNewsOnNewsfield()
	{
		RandomUtility randomUtility=new RandomUtility();
		String news=randomUtility.fakerNews();
		newsField.sendKeys(news);
	}
	public void clickOnSaveButton()
	{
		saveButtonField.click();
	}
	public boolean alertMessageAppears()
	{
		boolean isAlertDisplayed=alertMessageField.isDisplayed();
		return isAlertDisplayed;
	}
}
