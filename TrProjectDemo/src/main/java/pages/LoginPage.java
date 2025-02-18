package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']") WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement buttonField;
	@FindBy(xpath="//p[text()='Admin Users']") WebElement dashboardAdminUser;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertMessageField;

	public LoginPage enterUserNameOnUserNameField(String username)
	{
		userNameField.sendKeys(username);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String password)
	{
		passwordField.sendKeys(password);
		return this;
	}

	public LoginPage clickOnButton() 
	{
		buttonField.click();
		return this;
	}

	public boolean dashBoardAppears()
	{
		boolean dashboard=dashboardAdminUser.isDisplayed();
		return dashboard;
	}

	public boolean alertMessageAppears() 
	{
		boolean isAlertDisplayed=alertMessageField.isDisplayed();
		return isAlertDisplayed;
	}

}




