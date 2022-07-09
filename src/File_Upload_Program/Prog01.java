package File_Upload_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement btn = driver.findElement(By.xpath("//input[@type='file']"));
		btn.sendKeys("C:\\Users\\Admin\\Downloads\\apppp.pdf");
		
		WebElement press = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		press.click();
		Thread.sleep(3000);
		driver.close();
	}

}
