package Frame_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		WebElement thmbtn = driver.findElement(By.xpath("//a[@onclick='retheme()']"));
		thmbtn.click();
		
	
		driver.switchTo().frame("iframeResult");
		WebElement clkbtn = driver.findElement(By.xpath("//button[@type='button']"));
		clkbtn.click();
		
		
		
		
		
		
		
	}

}
