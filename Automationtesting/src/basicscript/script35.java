package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script35 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.sendKeys("iphone");
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		WebElement text = driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
		text.click();
		Thread.sleep(2000);
		WebElement btn1=driver.findElement(By.xpath("//button[.='Add to cart']"));
		btn1.click();

		
	}

}
