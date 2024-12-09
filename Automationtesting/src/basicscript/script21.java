package basicscript;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script21 {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Point p = new Point(300, 900);
	driver.manage().window().setPosition(p);

}
}
