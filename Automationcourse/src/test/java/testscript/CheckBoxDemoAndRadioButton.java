package testscript;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxDemoAndRadioButton extends Base{
	public void verifyWhetherUserIsAbleToSelectcheckBox()
	{
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	checkBox.click();
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(3))
            .ignoring(NoSuchElementException.class);
	fluentWait.until(ExpectedConditions.elementToBeClickable(checkBox));//fluent wait
	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait4.until(ExpectedConditions.elementToBeSelected(checkBox));
	
	boolean isCheckboxSelected= checkBox.isSelected();
	
	if(checkBox.isSelected()==true)
	{
		System.out.println("CheckBox is selected");
	}
	else
	{
		System.out.println("Checkbox not selected");
	}
	}
	
	
	
	public void verifyWhethertheUserIsAbleToSelectedMaleOption()
	{
		String expectedResult="Radio button 'Male'is checked";
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));	
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(3))
	            .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeSelected(maleRadioButton));//fluent wait
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait4.until(ExpectedConditions.elementToBeSelected(maleRadioButton));
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isMaleRadioButtonIsSelected=maleRadioButton.isSelected();
		boolean isFemaleRadioButtonSelected=femaleRadioButton.isSelected();
		if(femaleRadioButton.isSelected()==false &maleRadioButton.isSelected()==false)
		{
			System.out.println("Initially radio buttons are unselected");
		}
		else
		{
			System.out.println("Initially radio buttons are enabled");
		}
		maleRadioButton.click();
		boolean isMaleRadioButtonSelected= maleRadioButton.isSelected();
		if(maleRadioButton.isSelected()==true)
		{
			System.out.println("Male radio button is selected");
		}
		else
		{
			System.out.println("Male radio button is not selected");
		}
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();	
		WebElement successMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualResult=successMessage.getText();
		if(expectedResult.equals(actualResult))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxDemoAndRadioButton checkbox = new CheckBoxDemoAndRadioButton();
		checkbox.initialiseBrowser();
		
		checkbox.verifyWhetherUserIsAbleToSelectcheckBox();
		checkbox.verifyWhethertheUserIsAbleToSelectedMaleOption();
		checkbox.browserQuit();
	}
}




