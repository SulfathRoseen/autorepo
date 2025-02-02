package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends Base {
	public void VerifySingleInputField()
	{
		
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;//javaScipt executor class
		js.executeScript("arguments[0].click();",showMessageButton );//method used to execute script
		//js.executeScript("window.scrollBy(0,350)", "");//to scroll page top to bottom
		//js.executeScript("window.scrollBy(0,-350)", "");//to scroll page bottom to top
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");//automatically calculate height of page and scroll from bottom to top
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecutor javaScriptExecutor =new JavaScriptExecutor();
		javaScriptExecutor.initialiseBrowser();
		javaScriptExecutor.VerifySingleInputField();
		javaScriptExecutor.browserQuit();
	}

}
