package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script40 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys("kavya@gmail.com");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Kav@2597");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usn.sendKeys("kavya@gmail.com");
		pwd.sendKeys("Kav@2597");
		
	}

}
