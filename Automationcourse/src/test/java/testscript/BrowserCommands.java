package testscript;

public class BrowserCommands extends Base{
	public void browserCommands()
	{
	String title=driver.getTitle()	;//get title of webpage
	String url=driver.getCurrentUrl();//to get the url
	String pagesource=driver.getPageSource(); //get the pagesource
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands browsercommands=new BrowserCommands();
browsercommands.initialiseBrowser();
browsercommands.browserCommands();
browsercommands.browserQuit();
	}

}
