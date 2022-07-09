package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project06 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement btn1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement clkbtn = driver.findElement(By.xpath("//span[text()='Delete']"));
	
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(btn1).contextClick(btn1).build().perform();
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		Thread.sleep(1000);
		a.sendKeys(Keys.ENTER).build().perform();
		Alert alt = driver.switchTo().alert();
		String str1 = alt.getText();
		System.out.println(str1);
		Thread.sleep(1000);
		alt.accept();
		
		
		WebElement btn2 = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		a.moveToElement(btn2).doubleClick().build().perform();
		Alert alt2 = driver.switchTo().alert();
		String str2 = alt2.getText();
		System.out.println(str2);
		Thread.sleep(2000);
		alt2.accept();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
