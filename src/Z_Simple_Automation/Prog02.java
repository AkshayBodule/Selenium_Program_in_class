package Z_Simple_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog02 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");		// get the URL
		Thread.sleep(3000);								// timing to stay your opened page
		driver.manage().window().maximize();			// maximize your page
		Thread.sleep(3000);
		driver.get("https://www.hackerrank.com/");		// open new URL
		Thread.sleep(3000);
		driver.manage().window().minimize();			// Minimize your page
		Thread.sleep(3000);
		driver.manage().window().maximize();			// Maximize your page
		Thread.sleep(3000);
		driver.navigate().to("https://www.codingninjas.com/");	// navigate to that page
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2500);
		driver.navigate().refresh();		
		Thread.sleep(5000);
		driver.close();									// close the URL project

	}

}
