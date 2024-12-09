package basicscript;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class script14 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoapps.qspiders.com/ui");

		Thread.sleep(9000);

		WebElement nm=driver.findElement(By.cssSelector("input[type='text']"));

		Thread.sleep(2000);

		nm.sendKeys("Deepa");

		WebElement eml=driver.findElement(By.id("email"));

		Thread.sleep(2000);

		eml.sendKeys("me@gmail.com");

		WebElement psw=driver.findElement(By.name("password"));

		Thread.sleep(2000);

		psw.sendKeys("meyou@14");

		WebElement btn=driver.findElement(By.cssSelector("button[type='submit']"));

		Thread.sleep(2000);

		btn.click();

		

		

		

	}



}
