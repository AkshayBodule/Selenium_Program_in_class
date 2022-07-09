package Action_class_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		WebElement list = driver.findElement(By.xpath("//button[normalize-space(text())='Select']"));
		list.click();
		Actions a = new Actions(driver);
		a.moveToElement(list).sendKeys(Keys.PAGE_DOWN).build().perform();
		
		for(int i=0;i<7;i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.DOWN).build().perform();
			
		}
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		
	
		Thread.sleep(3000);
		driver.close();
		
	}

}
