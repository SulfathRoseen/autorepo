package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends BaseTesting {
	
	@Test(description="verifying background colour")
public void verifyTheBackGroundColourOfShowMessageButton() 
{
		String expectedbackGroundColour="rgba(0, 123, 255, 1)";
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		String actualbackGroundColour= showMessageButton.getCssValue("background-color");
		
		assertEquals(expectedbackGroundColour,actualbackGroundColour,"Expected background colour is"+ expectedbackGroundColour+"But it is"+actualbackGroundColour);
		
		}
	public void verifyWhetherTheShowMessageButtonIsAvailableInTheHomepage()
	{
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean isShowButtonMessageDisplayed=showMessageButton.isDisplayed();
		assertTrue(isShowButtonMessageDisplayed,"show message button is not available");
	}
	@Test(description ="Verify single input field")

	public void verifySingleInputField() {

	

		String expectedYourMessageText="hello";
		WebElement singleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputField.sendKeys(expectedYourMessageText);
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));//explicit wait
		showMessageButton.click();
		WebElement yourMessageTextBox=driver.findElement(By.xpath("//div[@id='message-one']"));
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='message-one']")));
		String yourMessageText= yourMessageTextBox.getText();
		String actualYourMessageText=yourMessageText.substring(15);

	

	 assertEquals(actualYourMessageText,expectedYourMessageText,"Expected test message is"+expectedYourMessageText + "But it is " +actualYourMessageText);

	

    }
	@Test(description="verify user is able to click on male button")
	

		public void verifyUserIsAbleToSelectMaleOption(){

				
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement radioButtonpage=driver.findElement(By.xpath("//a[@href='radio-button-demo.php']"));

		radioButtonpage.click();

		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));

	   

		boolean isMaleButtonDisplayed = maleRadioButton.isDisplayed();

		assertTrue(isMaleButtonDisplayed,"User can't able to click the male radio button");
		
		boolean flag=false;
		assertFalse(flag,"Expected message is true but it is false");
		int a=5;
		int b=4;
		assertNotEquals(a,b,"A and B are equal");
		
		String str=null;
		assertNull(str,"str is not null");
		String s="Not null";
		assertNotNull(s,"S is null");
	}
	@Test
	public void softAssert()
	{
		SoftAssert softAssert=new SoftAssert();
		boolean flag=false;
		softAssert.assertFalse(flag,"Expected message is true but it is false");
		int a=5;
		int b=4;
		assertNotEquals(a,b,"A and B are equal");
		
		String str=null;
		assertNull(str,"str is not null");
		softAssert.assertAll();//ith koduthillel soft asser wrk aavilla
	}
}

