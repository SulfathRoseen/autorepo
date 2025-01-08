package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void locators()
	{
	WebElement	showmessage=driver.findElement(By.id("button-one"));//to identify element
	WebElement	classNameSample=driver.findElement(By.className("clearfix"));
	WebElement	nameSample=driver.findElement(By.name("viewport"));
	WebElement	linkTextSample=driver.findElement(By.linkText("check-box-demo.php"));
	WebElement partialLinkText = driver.findElement(By.partialLinkText(" check-box"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initialiseBrowser();
		webelementcommands.locators();
		webelementcommands.browserQuit();
	}

}
