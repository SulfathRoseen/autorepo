package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators extends Base {
	
	public void locators()
	{
	WebElement	showmessage=driver.findElement(By.id("button-one"));//to identify element
	WebElement	classNameSample=driver.findElement(By.className("clearfix"));
	WebElement	nameSample=driver.findElement(By.name("viewport"));
	WebElement	linkTextSample=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement partialLinkText = driver.findElement(By.partialLinkText("Checkbox"));
	WebElement getTotal=driver.findElement(By.id("button-two"));
	WebElement classNamegetTotal=driver.findElement(By.className("btn btn-primary"));
	WebElement	linkRadioButton=driver.findElement(By.linkText("radio-button-demo.php"));
	WebElement partialLinkRadio = driver.findElement(By.partialLinkText("radio-button"));
	WebElement	getAllSelected=driver.findElement(By.id("button-first"));
	WebElement	selectInputDemo=driver.findElement(By.id("single-input-field"));
	WebElement	classNameSelectInputDemo=driver.findElement(By.className("form-control"));
	
	
	//Css
	WebElement classNameNew=driver.findElement(By.cssSelector(".clearfix"));
	WebElement classNameCss=driver.findElement(By.cssSelector("section.clearfix"));
	WebElement classNameCssId=driver.findElement(By.cssSelector("button#button-one"));
	WebElement classNameCssAttribute=driver.findElement(By.cssSelector("link[href='css/main.css']"));
	WebElement classNameTagname=driver.findElement(By.tagName("div"));
	WebElement classNameXpathSample=driver.findElement(By.xpath("//button[@id='button-one']"));
	
	//Xpath
	WebElement XpathSample=driver.findElement(By.xpath("//input[@id='button-two']"));
	WebElement classXpathSample=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	WebElement getFirstSelectedXpathSample=driver.findElement(By.xpath("//button[@id='button-first']"));
	WebElement getAllSelectedXpathSample=driver.findElement(By.xpath("//button[@id='button-all']"));
	WebElement selectInputDemoXpathSample=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	WebElement containsXpathSample=driver.findElement(By.xpath("//button[contains(@id,'button-o')]"));
	WebElement startsWithXpathSample=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
	WebElement textXpathSample=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait5.until(ExpectedConditions.textToBePresentInElement(textXpathSample, "Show Message"));
	
	WebElement textAndXpathSample=driver.findElement(By.xpath("//button[text()='Show Message' and @id='button-one']"));
	WebElement textOrXpathSample=driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-three']"));
	
	//access maethod
	WebElement accessParentXpathSample=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));	
	WebElement accessChildXpathSample=driver.findElement(By.xpath("//section[@class='clearfix']//child::div[@class='container page']"));
	WebElement accessFollowingXpathSample=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));	
	WebElement accessPrecedingXpathSample=driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[class='header-top']"));	
	WebElement accessAncestorXpathSample=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));	
	WebElement accessDecendantXpathSample=driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='container page']"));
	WebElement accessFollowingSiblingXpathSample=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));	
	WebElement accessEgParentXpathSample=driver.findElement(By.xpath("//button[@id=id='button-two']//parent::form"));	
	WebElement accessEgChildXpathSample=driver.findElement(By.xpath("//div[@class='card-body']//child::form[@class='needs-validation']"));
	WebElement accessEgFollowingXpathSample=driver.findElement(By.xpath("//button[@id='button-two']//following::div[@id='message-two']"));	
	WebElement accessEgAncestorXpathSample=driver.findElement(By.xpath("//button[@id='button-two']//ancestor::div[@class='container page']"));
	WebElement accessEgDecendantXpathSample=driver.findElement(By.xpath("//footer[@class='mt-5']//descendant::div[@class='copyright']"));
	WebElement accessEgFollowingSiblingXpathSample=driver.findElement(By.xpath("//button[@id='button-two']//following-sibling::div"));
	}
	public static void main(String[] args) {
	
		Locators webelementcommands = new Locators();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();
	}

}
