package Headless_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prog01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions a = new ChromeOptions();
		a.addArguments("headless");
		
		
		
		WebDriver driver = new ChromeDriver(a);
		driver.get("https://www.google.co.in/");
		
		WebElement text = driver.findElement(By.xpath("//a[text()=' How Search works ']"));
		System.out.println(text.getText());
		

	}

}
