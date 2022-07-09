package Wait_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prog02_ExpliciteWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		
		WebElement alertbtn1 = driver.findElement(By.xpath("//button[@id='alert']"));
		alertbtn1.click();
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
		btn2.click();
		WebElement text = driver.findElement(By.xpath("//h2[@id='h2']"));
		w.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		
		WebElement btn3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		btn3.click();
		WebElement hidden = driver.findElement(By.xpath("//button[@id='hidden']"));
		w.until(ExpectedConditions.visibilityOfAllElements(hidden));
		
		WebElement btn4 = driver.findElement(By.xpath("//button[@id='enable-button']"));
		btn4.click();
		WebElement displaybtn = driver.findElement(By.xpath("//button[@id='disable']"));
		w.until(ExpectedConditions.elementToBeClickable(displaybtn));
		
		WebElement btn5 = driver.findElement(By.xpath("//button[@id='checkbox']"));
		btn5.click();
		WebElement click = driver.findElement(By.xpath("//input[@id='ch']"));
		w.until(ExpectedConditions.elementToBeSelected(click));
		driver.close();
	}

}
