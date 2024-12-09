package basicscript;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script27 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://flipkart.com");
		List<WebElement>Links =driver.findElements(By.xpath("//a"));
		int count= Links.size();
		for(int i=count-1;i>=0;i--)
		{
			if(i%2==0) {
			
			WebElement Link=Links.get(i);
			String txt=Link.getText();
			System.out.println(i+ ""+txt);
			}
		}
		Thread.sleep(2000);
		driver.quit();
			
			
		}
		
	}


