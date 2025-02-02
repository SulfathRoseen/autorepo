package testscript;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTesting {
	public WebDriver driver;
	@BeforeMethod
	public void initialiseBrowser()
	{
	driver=new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
	
	}
	@AfterMethod
	
	public void browserQuit()
	{	
		driver.quit();
	}
}

