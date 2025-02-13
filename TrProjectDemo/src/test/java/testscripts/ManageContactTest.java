package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {

	@Test(description="verifying user is able to manage the contact")
	public void verifyUserIsAbleToManagetheContact()
	{
		String userName = ExcelUtility.getString(1, 0, "manageContact");
		String passWord = ExcelUtility.getString(1, 1, "manageContact");
		String url=ExcelUtility.getString(1, 2, "manageContact");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		ManageContactPage manageContactPage=new ManageContactPage(driver);
		manageContactPage.navigate(url);
		manageContactPage.clickOnEditButton();
		manageContactPage.enterPhoneNumberOnPhoneNumberField();
		manageContactPage.enterEmailAddressOnEmailAdressField();
		manageContactPage.enterAddressOnAddressField();
		manageContactPage.enterTimeOnDeliveryTimeField();
		manageContactPage.enterDeliveryLimitOnDeliveryLimitField();
		manageContactPage.clickTheUpdateButton();
		boolean isupdated=manageContactPage.alertMessageAppears();
		assertTrue(isupdated,"User cannot able to manage the contact");

	}
}
