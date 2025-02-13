package testscripts;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LogInTest extends Base {

	@Test(description=" verifying the user is able to login with the valid username with valid password",groups=("smoke"))
	public void verifyUserIsAbleToLoginWithValidUserNameAndValidPassword() {
		String userName = ExcelUtility.getString(1, 0, "logInPage");
		String passWord = ExcelUtility.getString(1, 1, "logInPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		boolean isNavigatedToDashBoard=	loginpage.dashBoardAppears();
		assertTrue(isNavigatedToDashBoard,"The User is not able to login with the valid username and password");
	}

	@Test(description=" verifying the user is not able to login with the valid username with Invalid password",groups=("regression"))
	public void verifyUserIsNotAbleToLoginWithTheValidUserNameAndInvalidPassword() {
		String userName = ExcelUtility.getString(2, 0, "logInPage");
		String passWord=ExcelUtility.getString(2, 2, "logInPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		boolean isAlertDispayed=loginpage.alertMessageAppears();
		assertTrue(isAlertDispayed,"The user is  able to login with the valid username with invalid password");

	}

	@Test(description=" verifying the user is not able to login with the valid username with Invalid password")
	public void verifyUserIsNotAbleToLoginWithTheInValidUserNameAndValidPassword() {
		String userName=ExcelUtility.getString(3, 0, "logInPage");
		String passWord=ExcelUtility.getString(3, 3,"logInPage" );
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		boolean isAlertDisplayed=loginpage.alertMessageAppears();
		assertTrue(isAlertDisplayed,"The user is able to login with the Invalid username with valid password ");

	}

	@Test(description=" verifying the user is not  able to login with the Invalid username with Invalid password")
	public void verifyUserIsNotAbleToLoginWithTheInValidUserNameAndInValidPassword() {
		String userName=ExcelUtility.getString(4, 0, "logInPage");
		String passWord=ExcelUtility.getString(4, 4, "logInPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		boolean isAlertDisplayed=loginpage.alertMessageAppears();
		assertTrue(isAlertDisplayed,"The user is able to login with the invalid username with invalid password");

	}
}
