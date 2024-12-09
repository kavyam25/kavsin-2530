package basicscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script26 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.xpath("//a[@href='/ui/table']"));
		ele3.click();
		Thread.sleep(2000);
		WebElement ele4=driver.findElement(By.xpath("//a[@href='/ui/table/dynamicTable']"));
		ele4.click();
		Thread.sleep(2000);
		WebElement ele5=driver.findElement(By.xpath("//th[contains(text(),'Levi')]/../following-sibling::tr[1]/td[1]/../following-sibling::tr[1]/td[2]/../following-sibling::tr[1]/td[3]"));
		ele5.click();
	
	
	}
}