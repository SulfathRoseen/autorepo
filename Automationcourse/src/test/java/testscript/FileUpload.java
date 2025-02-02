package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class FileUpload extends Base
{
	public void fileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chooseFile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		chooseFile.sendKeys("D:\\automation\\s1.pdf");


	}





	public void fileUploadUsingRobotClass () throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectpdffile = driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectpdffile.click();
		StringSelection sS =new StringSelection("D:\\\\automation\\\\s1.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sS,null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);//press enter key
		//releasing enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(30);
		robot.keyPress(KeyEvent.VK_CONTROL);//click on ctrl V (paste)
		robot.keyPress(KeyEvent.VK_V);//two


		robot.keyRelease(KeyEvent.VK_CONTROL);//release command
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(50);

		// r.delay(90);
		//D:\D drive\Software testing\Certificates\Manual.pdf
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

















	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileUpload = new FileUpload();
		fileUpload.initialiseBrowser();
		//fileUpload.fileUploadUsingSendKeys();
		try {
			fileUpload.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileUpload.browserQuit();

	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		