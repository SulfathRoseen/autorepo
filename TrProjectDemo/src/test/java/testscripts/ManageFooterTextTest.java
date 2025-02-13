package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base{
	
@Test(description="verifying user is able to update the manager footer text")
	public void verifyUserIsAbleToUpdateTheManageFooterText()
	{
		String userName=ExcelUtility.getString(1, 0, "manageFooterText");
		String passWord=ExcelUtility.getString(1, 1, "manageFooterText");
		String url=ExcelUtility.getString(1, 2, "manageFooterText");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		ManageFooterTextPage manageFooterPage=new ManageFooterTextPage(driver);
		manageFooterPage.clickOnEditButton();
		manageFooterPage.enterAddressOnAddressField();
		manageFooterPage.enterEmailOnEmailField();
		manageFooterPage.enterPhoneNumberOnPhoneNumberField();
		manageFooterPage.clickOnUpdateButtonField();
		boolean isupdated=manageFooterPage.alertMessageAppears();
		assertTrue(isupdated,"User cannot able to manage the contact");
	}
}
