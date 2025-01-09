package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	
	public void locators()
	{
	WebElement	showmessage=driver.findElement(By.id("button-one"));//to identify element
	WebElement	classNameSample=driver.findElement(By.className("clearfix"));
	WebElement	nameSample=driver.findElement(By.name("viewport"));
	WebElement	linkTextSample=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement partialLinkText = driver.findElement(By.partialLinkText("checkbox"));
	WebElement getTotal=driver.findElement(By.id("button-two"));
	WebElement classNamegetTotal=driver.findElement(By.className("btn btn-primary"));
	WebElement	linkRadioButton=driver.findElement(By.linkText("radio-button-demo.php"));
	WebElement partialLinkRadio = driver.findElement(By.partialLinkText("radio-button"));
	WebElement	getAllSelected=driver.findElement(By.id("button-first"));
	WebElement	selectInputDemo=driver.findElement(By.id("single-input-field"));
	WebElement	classNameSelectInputDemo=driver.findElement(By.className("form-control"));
	WebElement classNameNew=driver.findElement(By.cssSelector(".clearfix"));
	WebElement classNameCss=driver.findElement(By.cssSelector("section.clearfix"));
	WebElement classNameCssId=driver.findElement(By.cssSelector("button#button-one"));
	WebElement classNameCssAttribute=driver.findElement(By.cssSelector("link[href='css/main.css']"));
	WebElement classNameTagname=driver.findElement(By.tagName("div"));
	WebElement classNameXpathSample=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebElement XpathSample=driver.findElement(By.xpath("//input[@id='button-two']"));
	WebElement classXpathSample=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
	WebElement getFirstSelectedXpathSample=driver.findElement(By.xpath("//button[@id='button-first']"));
	WebElement getAllSelectedXpathSample=driver.findElement(By.xpath("//button[@id='button-all']"));
	
	
	}
	public static void main(String[] args) {
	
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();
	}

}
