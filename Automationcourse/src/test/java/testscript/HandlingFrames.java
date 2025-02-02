package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	public void handlingFrames()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframes=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		//driver.switchTo().frame(2);//by index value
		driver.switchTo().frame(iframes);
		//driver.switchTo().frame("a077aa5e");//by the element name
		WebElement jmeter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeter.click();
	}

	public static void main(String[] args) {
		
HandlingFrames handlingFrameNew=new HandlingFrames();
handlingFrameNew.initialiseBrowser();
handlingFrameNew.handlingFrames();
handlingFrameNew.browserQuit();
	}

}
