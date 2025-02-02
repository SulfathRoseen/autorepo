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

public class WaitCommands extends Base{
public void explicitWait()
{
	WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
	wait.until(ExpectedConditions.elementToBeClickable(showMessageButton));//explicit wait
	
	WebElement alertBox=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
	WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='message-one']")));
			
	WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
	WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait4.until(ExpectedConditions.elementToBeSelected(checkBox));
	
	
	WebElement textXpathSample = driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait5.until(ExpectedConditions.textToBePresentInElement(textXpathSample, "Show Message"));
	
	
}
public void fluentWait()
{
	WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(3))
            .ignoring(NoSuchElementException.class);
	fluentWait.until(ExpectedConditions.elementToBeClickable(getTotalButton));//fluent wait
	getTotalButton.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WaitCommands waitCommands=new WaitCommands();
waitCommands.initialiseBrowser();
waitCommands.explicitWait();
//waitCommands.fluentWait();
waitCommands.browserQuit();
	}

}
