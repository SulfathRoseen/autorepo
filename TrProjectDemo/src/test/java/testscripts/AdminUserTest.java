package testscripts;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;



import pages.AdminUserPage;
import pages.LoginPage;
import retry.ReTry;
import utilities.ExcelUtility;


public class AdminUserTest extends Base {

	@Test(description="Verifying user is able to add new Admin Users",retryAnalyzer=ReTry.class)
	public void verifyUserIsAbleToAddNewAdminUser() {
		String userName = ExcelUtility.getString(1, 0, "adminUser");
		String passWord = ExcelUtility.getString(1, 1, "adminUser");
		String url=ExcelUtility.getString(1, 2, "adminUser");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		AdminUserPage adminUserPage = new AdminUserPage(driver);
		adminUserPage.navigate(url).newButtonClick().enterFakeUserNameOnUserNameField().enterFakePasswordOnPasswordField().userTypeOnDropDownField().clickOnSaveButton();
		boolean isUserCreated=adminUserPage.alertMessageAppears();
		assertTrue(isUserCreated,"User cannot able to add new admin user");

	}



	@Test(description="Verifying user is able to search")
	public void verifyUserIsAbleToSearch()
	{
		String userName = ExcelUtility.getString(1, 0, "adminUser");
		String passWord = ExcelUtility.getString(1, 1, "adminUser");
		String url=ExcelUtility.getString(1, 2, "adminUser");
		String userNameField=ExcelUtility.getString(1, 3, "adminUser");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		AdminUserPage adminUserPage = new AdminUserPage(driver);
		adminUserPage.navigate(url).clickOnsearchButton().enterUserNameOnUserNameField(userNameField).dropDownOnSearchButton().buttonOnSearchClick();
		boolean isPageAppears=adminUserPage.pageAppearsOnSearch();
		assertTrue(isPageAppears,"User cannot able to search");
	}

	@Test(description="Verifying user is able to delete")
	public void verifyUserIsAbleToDelete()
	{
		String userName = ExcelUtility.getString(1, 0, "adminUser");
		String passWord = ExcelUtility.getString(1, 1, "adminUser");
		String url=ExcelUtility.getString(1, 2, "adminUser");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		AdminUserPage adminUserPage = new AdminUserPage(driver);
		adminUserPage.navigate(url).clickOnDeleteButton().popUpMessage();
		boolean isUserDeleted=	adminUserPage.alertMessageAppears();
		assertTrue(isUserDeleted,"User cannot able delete the user");


	}

}
