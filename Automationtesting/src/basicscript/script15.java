package basicscript;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;



public class script15 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		WebElement ele1 =driver.findElement(By.cssSelector("input[id='email']"));
		ele1.sendKeys("9148680823");


		Thread.sleep(2000);

		WebElement ele2=driver.findElement(By.cssSelector("input[id='pass']"));

		ele2.sendKeys("Killer@2530");

		Thread.sleep(2000);

		WebElement ele3=driver.findElement(By.cssSelector("button[type='submit']"));

		ele3.click();

	}



}