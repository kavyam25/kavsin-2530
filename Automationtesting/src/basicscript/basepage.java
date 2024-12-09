package basicscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class basepage {
	public WebDriver driver;
	@Parameters("BrowserName")
	@BeforeMethod
	public void Browsersetup(String BrowserName)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		if(BrowserName.equals("chrome"))
		{
			driver=new chromeDriver;
			
			
		}
			
	}
	

}
