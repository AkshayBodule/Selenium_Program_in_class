package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement mainSearchButton = driver.findElement(By.xpath("//input[@id='s']"));
		mainSearchButton.sendKeys("Objects");
		WebElement mainSearchButton1 = driver.findElement(By.xpath("(//button[@class='button_search'])[1]"));
		mainSearchButton1.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.switchTo().frame("globalSqa");
		WebElement frameSearchButton = driver.findElement(By.xpath("//input[@id='s']"));
		frameSearchButton.sendKeys("Java");
		WebElement frameSearchButton1 = driver.findElement(By.xpath("//button[@class='button_search']"));
		frameSearchButton1.click();
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
