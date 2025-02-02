package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsAndModals extends Base {
	public void alertsandmodals()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertBox=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alertBox.click();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.alertIsPresent());
		String alertBoxGet =driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		
		WebElement confirmBox=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		confirmBox.click();
		driver.switchTo().alert().dismiss();
		
		
		
		WebElement promptBox=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("Sulfath");
		driver.switchTo().alert().accept();
		
		
	}

	public static void main(String[] args) {
	
AlertsAndModals boxes=new AlertsAndModals();
boxes.initialiseBrowser();
boxes.alertsandmodals();
boxes.browserQuit();
	}

}
