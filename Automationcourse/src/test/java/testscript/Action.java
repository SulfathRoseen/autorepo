package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action extends Base {
	public void actionClass()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement draggable=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dottedColumn=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		//actions.moveToElement(draggable).build().perform();
		//actions.doubleClick(draggable).perform();
		//actions.contextClick( draggable).perform();
		//actions.dragAndDrop(draggable, dottedColumn).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Action actionNew=new Action();
actionNew.initialiseBrowser();
actionNew.actionClass();
actionNew.browserQuit();
	}

}
