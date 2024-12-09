package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script34 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement search = driver.findElement(By.xpath("//input[@id='user-name']"));
		search.sendKeys("standard_user");
		WebElement search1 = driver.findElement(By.xpath("//input[@id='password']"));
		search1.sendKeys("secret_sauce");
		WebElement btn=driver.findElement(By.xpath("//input[@id='login-button']"));
		btn.click();
		Thread.sleep(1000);
		WebElement option=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String text = option.getText();
		System.out.println(text);
		WebElement price=driver.findElement(By.xpath("//div[@class='inventory_item_price'])[1]"));
		String value = price.getText();
		System.out.println(value);
		
		
	}


}
