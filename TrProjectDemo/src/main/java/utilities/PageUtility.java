package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	public void selectFromDropDownUsingValue(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void selectFromDropDownUsingIndex(WebElement element,int value)
	{
		Select select = new Select(element);
		select.selectByIndex(value);
	}
	public void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	public void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-350)", "");
	}
	public String alertText(WebElement element ,WebDriver driver)
	{
		String alertBoxText = driver.switchTo().alert().getText();
		return alertBoxText;
	}

	public void alertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	public void alertPopupDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void swithchToChildWindowClickAnElement(WebDriver driver,WebElement element)
	{
		String mainWindow = driver.getWindowHandle();// used to identify the parent
		Set<String> popupWindow = driver.getWindowHandles();
		Iterator<String> i1=popupWindow.iterator();
		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();		

			if(!mainWindow.equalsIgnoreCase(ChildWindow))			
			{    		
				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				element.click(); 
			}
		}

		driver.close();
		driver.switchTo().window(mainWindow);
	}


	public void actionsClass(WebElement element, WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();	
	}

	public void actionClassForDoubleClick(WebElement element, WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void actionClassForContextClick(WebElement element, WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}
	public void actionClassForDragandDrop(WebElement element,WebElement element2, WebDriver driver)
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, element2).build().perform();
	}
}


