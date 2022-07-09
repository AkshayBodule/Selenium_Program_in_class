package Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		WebElement SearchText = driver.findElement(By.xpath("//input[@name='q']"));
		SearchText.sendKeys("death");
		Thread.sleep(1500);
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
				System.out.println(ac);
			}
		}
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
