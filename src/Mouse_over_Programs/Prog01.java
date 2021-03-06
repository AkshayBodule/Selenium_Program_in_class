package Mouse_over_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[@href='/about-us']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(aboutUs).build().perform();
		
		WebElement career = driver.findElement(By.xpath("//li[@class='leaf']//a[@target='_blank' and text()='Careers']"));
		career.click();
		
			
		
	}

}
