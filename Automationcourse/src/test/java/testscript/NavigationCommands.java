package testscript;

public class NavigationCommands extends Base {
	public void navigators()
	{
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

	public static void main(String[] args) {
	NavigationCommands navigationCommands = new NavigationCommands();
	navigationCommands.initialiseBrowser();
	navigationCommands.navigators();
	navigationCommands.browserQuit();

	}

}
