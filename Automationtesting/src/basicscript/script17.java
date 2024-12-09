package basicscript;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class script17 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.googlemaps.com");

		WebElement direction = driver.findElement(By.cssSelector("input[id='search']"));

		direction.sendKeys("hindi songs");

		WebElement btn=driver.findElement(By.xpath("html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/ytd-searchbox/button/yt-icon/span/div"));

		btn.click();

		
		

	}



}
