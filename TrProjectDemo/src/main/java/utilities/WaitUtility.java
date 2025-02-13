package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

	public static final long IMPLICIT_WAIT = 5;
	public static final long EXPLICIT_WAIT = 30;
	public static final long FLUENT_WAIT_TIMEOUT = 5;
	public static final long FLUENT_WAIT_POLLING = 5;
	
	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitCommandsToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));//explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void waitCommandsAlertToBePresent(WebDriver driver, WebElement element)
	{
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		explicitWait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	public void waitCommandselementToBeSelected(WebDriver driver, WebElement element)
	{
		WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		explicitWait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public void fluentWaitCommandsToBeClickable(WebDriver driver, WebElement element)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIMEOUT))
				.pollingEvery(Duration.ofSeconds(FLUENT_WAIT_POLLING))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void fluentWaitVisibility(WebDriver driver, WebElement element)
	{
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIMEOUT))
				.pollingEvery(Duration.ofSeconds(FLUENT_WAIT_POLLING))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOf(element));
	}
}

