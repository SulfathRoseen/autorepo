package testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TableHeader extends Base{
	public void headerTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<String>expectedTable=new ArrayList<String>();
		expectedTable.add("Name");
		expectedTable.add("Position");
		expectedTable.add("Office");
		expectedTable.add("Age");
		expectedTable.add("Start date");
		expectedTable.add("Salary");
		System.out.println(expectedTable);
		List <WebElement> actualTableResult=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//th  "));
		List<String> actualTable = new ArrayList<String>();
		for(WebElement headerList:actualTableResult)
		{
			actualTable.add(headerList.getText());
			
		}
	if (expectedTable.equals(actualTable))	
	{
		System.out.println("The table matches");
	}
	else
	{
		System.out.println("The table does not matches");
	}
	}
	
	
	
	

	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TableHeader header=new TableHeader();
header.initialiseBrowser();
header.headerTable();
header.browserQuit();

	}

}
