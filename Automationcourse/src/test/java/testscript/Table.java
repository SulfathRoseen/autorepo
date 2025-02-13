package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends 	Base {
	public void table()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tableName=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));

		for(WebElement option:tableName)
		{
			String name=option.getText();
			if (name.equals("Ashton Cox		"))
			{
				System.out.println("Ashton Cox is found");
				break;
			}
			{

			}

		}
	}
	public void table1()
	{

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");

		List<WebElement> tableNames=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));

		for(WebElement names:tableNames)
		{
			String name1=names.getText();
			if (name1.equals("Cedric Kelly	"))
			{
				System.out.println("Cedric Kelly is found");
				break;
			}
			{
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table tableNew=new Table();
		tableNew.initialiseBrowser();
		//tableNew.table();
		tableNew.table1();

		tableNew.browserQuit();

	}

}
