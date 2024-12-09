package basicscript;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class script12 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/USER/Desktop/k2.html");

		WebElement ele1=driver.findElement(By.id("t1"));

		ele1.sendKeys("deepaa");

		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.name("n1"));

		ele2.sendKeys("hello");

		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.className("c1"));

		ele3.sendKeys("heeelooo");

		Thread.sleep(2000);

		ele1.clear();

		Thread.sleep(2000);

		WebElement ele4= driver.findElement(By.linkText("Instagram 2024"));

		ele4.click();

		

		

	}



}