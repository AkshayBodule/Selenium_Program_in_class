package Wait_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog01_impliciteWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// Implicite Wait method
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement SearchText = driver.findElement(By.xpath("//input[@name='q']"));
		SearchText.sendKeys("death");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		System.out.println("Size of Elements = "+ list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		for(int i=0;i<list.size();i++)
		{
			String ex = "death note";
			String ac = list.get(i).getText();
			if(ac.equals(ex))
			{
				list.get(i).click();
				System.out.println("name = "+ac);
				break;
			}
		}
		
		
		driver.close();

	}

}
