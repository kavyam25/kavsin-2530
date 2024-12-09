package basicscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script29 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/USER/Desktop/k5.html");
		
	}

}
