package Z_Simple_Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p = new Point(275,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.close();
	}

}
