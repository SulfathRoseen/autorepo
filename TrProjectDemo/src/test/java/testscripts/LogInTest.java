package testscripts;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LogInTest extends Base {

	@Test(description=" verifying the user is able to login with the valid username with valid password",groups=("smoke"))
	public void verifyUserIsAbleToLoginWithValidUserNameAndValidPassword() {
		String userName = ExcelUtility.getString(1, 0, "logInPage");
		String passWord = ExcelUtility.getString(1, 1, "logInPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		boolean isNavigatedToDashBoard=	loginpage.dashBoardAppears();
		assertTrue(isNavigatedToDashBoard,"The User is not able to login with the valid username and password");
	}

	@Test(description=" verifying the user is not able to login with the valid username with Invalid password",groups=("regression"))
	public void verifyUserIsNotAbleToLoginWithTheValidUserNameAndInvalidPassword() {
		String userName = ExcelUtility.getString(2, 0, "logInPage");
		String passWord=ExcelUtility.getString(2, 1, "logInPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		boolean isAlertDispayed=loginpage.alertMessageAppears();
		assertTrue(isAlertDispayed,"The user is  able to login with the valid username with invalid password");

	}

	@Test(description=" verifying the user is not able to login with the valid username with Invalid password")
	public void verifyUserIsNotAbleToLoginWithTheInValidUserNameAndValidPassword() {
		String userName=ExcelUtility.getString(3, 0, "logInPage");
		String passWord=ExcelUtility.getString(3, 1,"logInPage" );
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		boolean isAlertDisplayed=loginpage.alertMessageAppears();
		assertTrue(isAlertDisplayed,"The user is able to login with the Invalid username with valid password ");

	}

	@Test(description=" verifying the user is not  able to login with the Invalid username with Invalid password",dataProvider="LoginProvider")
	public void verifyUserIsNotAbleToLoginWithTheInValidUserNameAndInValidPassword(String userName, String passWord) {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		boolean isAlertDisplayed=loginpage.alertMessageAppears();
		assertTrue(isAlertDisplayed,"The user is able to login with the invalid username with invalid password");

	}
	@DataProvider(name = "LoginProvider")
	public Object[][] getDataFromTestData() {
		return new Object[][] { { ExcelUtility.getString(4, 0, "LoginPage"), ExcelUtility.getString(4, 1, "LoginPage") },
			{"abc","abc"},
			{"hello123","hello123"}

		};
}
}
