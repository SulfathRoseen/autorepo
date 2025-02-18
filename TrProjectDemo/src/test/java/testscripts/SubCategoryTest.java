package testscripts;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.SubCategoryPage;
import utilities.ExcelUtility;
import pages.LoginPage;

public class SubCategoryTest extends Base {

	@Test(description="verifying User Is Able To Add SubCategory")	
	public void verifyUserIsAbleToAddSubCategory()
	{
		String userName = ExcelUtility.getString(1, 0, "subCategory");
		String passWord = ExcelUtility.getString(1, 1, "subCategory"); 
		String url=ExcelUtility.getString(1, 2, "subCategory");
		String category=ExcelUtility.getString(1, 3, "subCategory");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		SubCategoryPage categoryPage = new SubCategoryPage(driver);
		categoryPage.navigateToUrl(url).clickOnNewButton().categoryOnDropDown().enterSubCategoryOnSubCategoryField(category).fileUploadingOnSubCategoryField().clickOnSaveButton();
		boolean isCategoryCreated=categoryPage.alertMessageAppears();
		assertTrue(isCategoryCreated,"User cannot able to add the subcategory");
	}

	public void verifyUserIsAbleToDelete()
	{
		String userName = ExcelUtility.getString(1, 0, "subCategory");
		String passWord = ExcelUtility.getString(1, 1, "subCategory"); 
		String url=ExcelUtility.getString(1, 2, "subCategory");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		SubCategoryPage categoryPage = new SubCategoryPage(driver);
		categoryPage.navigateToUrl(url).clickOnDeleteButton().popUpMessage();
		boolean isCategoryDeleted=categoryPage.alertMessageAppears();
		assertTrue(isCategoryDeleted,"User cannot able to delete the subcategory");
	}
}
