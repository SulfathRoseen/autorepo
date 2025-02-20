package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
public void fileUploadUsingSendKeys(WebElement element,String filePath)
{
	element.sendKeys(filePath);
}
public void fileUploadUsingRobotClass(WebElement element,String filepath) throws AWTException
{
	element.click();
	StringSelection stringSelection =new StringSelection(filepath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.delay(30);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);


	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(50);

	

	
}
}

