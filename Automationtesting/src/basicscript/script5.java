package basicscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script5 {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.close();
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.netflix.com");
		Thread.sleep(10000);
		driver1.quit();
	}

}
