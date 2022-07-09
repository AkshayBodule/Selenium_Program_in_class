package Z_Simple_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement elementstore = driver.findElement(By.xpath("//input[@id='fullname']"));
		elementstore.sendKeys("IRON MAN");
		
		WebElement listBox = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s = new Select(listBox);
		Thread.sleep(2000);
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByValue("15");
		Thread.sleep(2000);
		s.selectByVisibleText("20");	//Mostly Used 
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
