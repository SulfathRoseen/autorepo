package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void verifydropDown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropdown);
		select.selectByValue("Red");
		select.selectByContainsVisibleText("Yellow");		
		select.selectByIndex(3);
		select.getOptions();
		List<WebElement> options =select.getOptions();
		int noOfOptions = options.size();
	}
	public void newDropdown()
	{
		driver.navigate().to("https://www.selenium.dev/downloads/");
		WebElement DropdownNew =driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']//following::ul[@class='dropdown-menu']"));
		DropdownNew.click();
	WebElement ulDropDown	=driver.findElement(By.xpath("//div[@class='dropdown']//child::a[@class='dropdown-item']"));
		ulDropDown.click();
		List<WebElement> dropDownOptions=driver.findElements(By.xpath("//div[@class='dropdown']//child::a[@class='dropdown-item']"));
	for(WebElement option:dropDownOptions)
	{
		String language=option.getText();
		if(language.equals("Português (Brasileiro)"))
		{
			option.click();
			break;
		}
	}
	
	
	}
	
	public void verifyMultipleDropdown()
	{
		
		WebElement multipleDropdown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select=new Select(multipleDropdown);
		boolean isMultipleDropSelected=select.isMultiple();
		select.selectByIndex(1);
		select.selectByIndex(2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DropDown DropDown2=new DropDown();
DropDown2.initialiseBrowser();
DropDown2.verifydropDown();
DropDown2.browserQuit();

	}

}

