package basicscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script6 {
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.netflix.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
