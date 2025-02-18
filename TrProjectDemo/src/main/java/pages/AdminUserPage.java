package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	@FindBy(xpath="(//a[@onclick=\"return confirm('Do you want to delete this User?')\"])[1]") WebElement deleteButtonField;
	
	public AdminUserPage navigate(String url)
	{
		driver.navigate().to(url);
		return this;
	}
	public AdminUserPage enterFakeUserNameOnUserNameField()
	{
		RandomUtility randomUtility=new RandomUtility();
		String userName=randomUtility.fakerFullName();
		userNameFieldOnAdminUser.sendKeys(userName);	
		return this;
	}
	public AdminUserPage enterFakePasswordOnPasswordField()
	{
		RandomUtility randomUtility=new RandomUtility();
	String passWord=	randomUtility.fakerPassword();
		passWordFieldOnAdminUser.sendKeys(passWord);
		return this;
	}
	public AdminUserPage newButtonClick()
	{
		newButtonField.click();
		return this;
	}
	public AdminUserPage userTypeOnDropDownField()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectFromDropDownUsingValue(dropDownField, "staff");
		return this;
	}
	public AdminUserPage clickOnSaveButton()
	{
		WaitUtility waitUtility=new WaitUtility();
		waitUtility.waitCommandsToBeClickable(driver, saveButtonField);
		saveButtonField.click();
		return this;
	}
	public boolean alertMessageAppears()
	{
		boolean alertMessage=alertMessageField.isDisplayed();
		return alertMessage;
	}
	public AdminUserPage enterUserNameOnUserNameField(String username)
	{
		userNameOnSearchButtonField.sendKeys(username);
		return this;
	}
	public AdminUserPage clickOnsearchButton()
	{
		searchButtonField.click();
		return this;
	}
	public AdminUserPage dropDownOnSearchButton()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectFromDropDownUsingValue(dropDownOnSearchButtonField, "staff");
		return this;

	}
	public AdminUserPage buttonOnSearchClick()
	{
		buttonOnSearchButtonField.click();
		return this;
	}
	public boolean pageAppearsOnSearch()
	{
		boolean pageAppears=pageAppearsOnSearchButtonField.isDisplayed();
		return pageAppears;
	}
	public AdminUserPage clickOnDeleteButton()
	{
		deleteButtonField.click();
		return this;
	}
	public AdminUserPage popUpMessage()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.alertPopup(driver);
		return this;
	}


}