package Mouse_over_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		WebElement signin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).build().perform();
		
		
		
		signin = driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		signin.click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
