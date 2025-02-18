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
		String news=ExcelUtility.getString(1, 3, "manageNews");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		ManageNewsPage manageNewsPage=new ManageNewsPage(driver);
		manageNewsPage.navigate(url).clickOnNewButton().enterNewsOnNewsfield(news).clickOnSaveButton();
		boolean isNewsCreated=manageNewsPage.alertMessageAppears();
		assertTrue(isNewsCreated, "User cannot able to add the news");
	}
	@Test(description="Verifying user is able to edit the news")
	public void verifyUserIsAbleToEditTheNews()
	{
		String userName = ExcelUtility.getString(1, 0, "manageNews");
		String passWord = ExcelUtility.getString(1, 1, "manageNews");
		String url=ExcelUtility.getString(1, 2, "manageNews");
		String editedNews=ExcelUtility.getString(1, 4, "manageNews");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameOnUserNameField(userName).enterPasswordOnPasswordField(passWord).clickOnButton();
		ManageNewsPage manageNewsPage=new ManageNewsPage(driver);
		manageNewsPage.navigate(url).enterNewsOnNewsfield(editedNews).clickOnUpdateButton();
		boolean isNewsEdited=manageNewsPage.alertMessageAppears();
		assertTrue(isNewsEdited, "User cannot able to edit the news");
	}
}
