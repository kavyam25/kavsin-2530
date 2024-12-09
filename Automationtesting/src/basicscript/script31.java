package basicscript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class script31 {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement usn = driver.findElement(By.id("email"));
		File Temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./screenshots/Element1.png");
		FileHandler.copy(Temp, perm);
		Thread.sleep(1000);
		driver.quit();
		
	}
}
