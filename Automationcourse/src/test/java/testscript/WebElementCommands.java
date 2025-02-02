package testscript;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	public void webElemts()
	{
		String expectedBackgroundColour="rgba(0, 123, 255, 1)";
		WebElement singleInputField=driver.findElement(By.xpath("//input[@id='single-input-field']"));	
		singleInputField.sendKeys("Hello");
		singleInputField.clear();
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		showmessage.click();
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessagetext= yourMessage.getText();
		String attribute= showmessage.getAttribute("type");
		String tagName=showmessage.getTagName();
		String backGroundColour= showmessage.getCssValue("background-color");
	}
	
	
	
	
	public void verifySingleInputField()
	{
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
		if( expectedYourMessageText.equals(actualYourMessageText))
		{
			System.out.println("actualResult matches with the expectedResult");
		}
		else
		{
			System.out.println("actualResult does not matches with the expectedResult");
		}
	}
	
	
	
	public void verifyTwoInputField()
	{
		int a=100;
		int b=200;
		int expectedResult=a+b;
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		enterValueA.sendKeys(""+a);
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		enterValueB.sendKeys(""+b);
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(10))
	            .pollingEvery(Duration.ofSeconds(3))
	            .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(getTotalButton));//fluent wait
		getTotalButton.click();
		
		WebElement total=driver.findElement(By.xpath("//div[@id='message-two']"));
		String totalResult=total.getText();
		int actualTotalResult=Integer.parseInt(totalResult.substring(14));	
		if(expectedResult==actualTotalResult)
		{
			System.out.println("The value matches");
		}
		else
		{
			System.out.println("The value does not matches");
		}
	}
	
	
	
	
	public void verifyBackGroundColourOfShowMessageButton()
	{
		String expectedbackGroundColour="rgba(0, 123, 255, 1)";
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		
		String actualbackGroundColour= showMessageButton.getCssValue("background-color");
		if(expectedbackGroundColour.equals(actualbackGroundColour))
		{
			System.out.println("Passed");
		
		}
		else
		{
			System.out.println("Failed");
		}
		}
	
	
	
	
	
	public void verifyTextColourOfShowMessageButton()
	{
		String expectedTextColour="rgba(255, 255, 255, 1)";
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualTextColour= showMessageButton.getCssValue("Text Colour");
		if(expectedTextColour.equals(actualTextColour))
		{
			System.out.println("Passed");
		
		}
		else
		{
			System.out.println("Failed");
		}
		}
	
	
	
	
	public void verifyBorderColourOfShowMessageButton()
	{
		String expectedBorderColour="rgba(0, 123, 255)";
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualBorderColour= showMessageButton.getCssValue("Border Colour");
		if(expectedBorderColour.equals(actualBorderColour))
		{
			System.out.println("Passed");
		
		}
		else
		{
			System.out.println("Failed");
		}
		}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands	 webElementCommands = new WebElementCommands()	;
		webElementCommands.initialiseBrowser();
		 webElementCommands.webElemts();
		 webElementCommands.verifySingleInputField();
		 webElementCommands.verifyTwoInputField();
		 webElementCommands.verifyBackGroundColourOfShowMessageButton();
		 webElementCommands.verifyTextColourOfShowMessageButton();
		webElementCommands.verifyBorderColourOfShowMessageButton();
		 webElementCommands.browserQuit();
		 
		 
	}
}
