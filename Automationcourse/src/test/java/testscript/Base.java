package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
public void initialiseBrowser()
{
driver=new ChromeDriver();
driver.get("https://selenium.qabible.in/simple-form-demo.php");
driver.manage();
driver.manage().window().maximize();
}
public void browserQuit()
{	
	driver.quit();
}
	public static void main(String[] args) {
	Base base=new Base();
	base.initialiseBrowser();
	base.browserQuit();

	}

}









