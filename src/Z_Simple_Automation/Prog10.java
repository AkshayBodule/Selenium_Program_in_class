package Z_Simple_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prog10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		WebElement email = driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		js.executeScript("arguments[0].value='9890423028';", email);
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.xpath(""));
		
		Thread.sleep(3000);
		driver.close();

	}

}