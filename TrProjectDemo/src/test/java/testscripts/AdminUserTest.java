package testscripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;


public class AdminUserTest extends Base {

	@Test(description="Verifying user is able to add new Admin Users")
	public void verifyUserIsAbleToAddNewAdminUser() {
		String userName = ExcelUtility.getString(1, 0, "adminUser");
		String passWord = ExcelUtility.getString(1, 1, "adminUser");
		String url=ExcelUtility.getString(1, 2, "adminUser");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		AdminUserPage adminUserPage = new AdminUserPage(driver);
		adminUserPage.navigate(url);
		adminUserPage.newButtonClick();
		adminUserPage.enterFakeUserNameOnUserNameField();
		adminUserPage.enterFakePasswordOnPasswordField();
		adminUserPage.userTypeOnDropDownField();
		adminUserPage.clickOnSaveButton();
		boolean isUserCreated=adminUserPage.alertMessageAppears();
		assertTrue(isUserCreated,"User cannot able to add new admin user");

	}



	@Test(description="Verifying user is able to search")
	public void verifyUserIsAbleToSearch()
	{
		String userName = ExcelUtility.getString(1, 0, "adminUser");
		String passWord = ExcelUtility.getString(1, 1, "adminUser");
		String userNameField=ExcelUtility.getString(1, 2, "adminUser");
		String url=ExcelUtility.getString(1, 3, "adminUser");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		AdminUserPage adminUserPage = new AdminUserPage(driver);
		adminUserPage.navigate(url);
		adminUserPage.clickOnsearchButton();
		adminUserPage.enterUserNameOnUserNameField(userNameField);
		adminUserPage.dropDownOnSearchButton();
		adminUserPage.buttonOnSearchClick();
		boolean isPageAppears=adminUserPage.pageAppearsOnSearch();
		assertTrue(isPageAppears,"User cannot able to search");
	}

}
