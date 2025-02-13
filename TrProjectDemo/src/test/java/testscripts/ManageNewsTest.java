package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	
@Test(description="verifying user is able to add the news")
	public void verifyUserIsAbleToAddNews()
	{
		String userName = ExcelUtility.getString(1, 0, "manageNews");
		String passWord = ExcelUtility.getString(1, 1, "manageNews");
		String url=ExcelUtility.getString(1, 2, "manageNews");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName);
		loginpage.enterPasswordOnPasswordField(passWord);
		loginpage.clickOnButton();
		ManageNewsPage manageNewsPage=new ManageNewsPage(driver);
		manageNewsPage.navigate(url);
		manageNewsPage.clickOnNewButton();
		manageNewsPage.enterNewsOnNewsfield();
		manageNewsPage.clickOnSaveButton();
		boolean isNewsCreated=manageNewsPage.alertMessageAppears();
		assertTrue(isNewsCreated, "User cannot able to add the news");
	}
}
