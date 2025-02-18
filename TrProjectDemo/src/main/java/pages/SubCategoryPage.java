package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;

	public  SubCategoryPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[@type='text']") WebElement userNameField;
	@FindBy(xpath = "//input[@type='password']") WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") WebElement buttonField;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newButtonField;
	@FindBy(xpath="//select[@id='cat_id']") WebElement dropDownField;
	@FindBy(xpath="//input[@id='subcategory']") WebElement subCategoryField;
	@FindBy(xpath="//input[@id='main_img']") WebElement chooseFileField;
	@FindBy(xpath="//button[text()='Save']") WebElement saveButtonField;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertMessagePage;
	@FindBy(xpath="(//a[@role='button'])[1]") WebElement deleteButtonField;

	public SubCategoryPage navigateToUrl(String Url)
	{
		driver.navigate().to(Url);
		return this;
	}
	public SubCategoryPage clickOnNewButton()
	{
		newButtonField.click();
		return this;

	}
	public SubCategoryPage categoryOnDropDown()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.selectFromDropDownUsingValue(dropDownField, "IceCream");
		return this;
	}
	public SubCategoryPage enterSubCategoryOnSubCategoryField(String subCategory)
	{
		subCategoryField.sendKeys(subCategory);
		return this;
	}
	public SubCategoryPage fileUploadingOnSubCategoryField()
	{
		FileUploadUtility fileUploadUtility=new  FileUploadUtility	();
		fileUploadUtility.fileUploadUsingSendKeys(chooseFileField, Constant.TESTFILEUPLOADFILE);
		return this;
	}
	public SubCategoryPage clickOnSaveButton()
	{
		saveButtonField.click();
		return this;
	}

	public boolean alertMessageAppears() 
	{
		boolean isAlertDisplayed=alertMessagePage.isDisplayed();
		return isAlertDisplayed;
	}
	public SubCategoryPage clickOnDeleteButton()
	{
		deleteButtonField.click();
		return this;
	}
	public SubCategoryPage popUpMessage()
	{
		PageUtility pageUtility=new PageUtility();
		pageUtility.alertPopup(driver);
		return this;
	}

}
