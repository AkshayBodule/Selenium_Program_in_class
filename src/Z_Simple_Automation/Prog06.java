package Z_Simple_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog06 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		// xpath by Attribute
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Akshay Bodule");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
