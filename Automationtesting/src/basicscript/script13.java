package basicscript;



import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class script13 {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/USER/Desktop/k3.html");

		WebElement un =driver.findElement(By.cssSelector("input[type='text']"));

		Thread.sleep(2000);

		un.sendKeys("hiiii");

		WebElement cb=driver.findElement(By.cssSelector("input[type='checkbox']"));

		Thread.sleep(2000);

		cb.click();

		WebElement rb = driver.findElement(By.cssSelector("input[type='radio']"));

		Thread.sleep(2000);

		rb.click();

		WebElement lnk=driver.findElement(By.cssSelector("a[href='https://www.youtube.com']"));

		Thread.sleep(2000);

		lnk.click();



	}



}

