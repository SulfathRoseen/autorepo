package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingPopUp extends Base {
	public void popUpWindow() 
	{
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement faceBookClick=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		faceBookClick.click();
		String mainWindow = driver.getWindowHandle();
		Set <String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!mainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    WebElement obscuraClick=driver.findElement(By.xpath("(//span[text()='See more from Obsqura Zone | Kazhakuttam '])[1]"));
	}
        }
		driver.close();
		driver.switchTo().window(mainWindow);
	}
	
	public static void main(String[] args) {
		
HandlingPopUp popUp=new HandlingPopUp();
popUp.initialiseBrowser();
popUp.popUpWindow();
popUp.browserQuit();
	}

}








//https://demo.guru99.com/test/upload///methoid 1
//https://www.ilovepdf.com/pdf_to_word//method 2