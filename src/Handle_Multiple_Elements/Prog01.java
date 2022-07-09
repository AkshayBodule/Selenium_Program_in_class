package Handle_Multiple_Elements;

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
		
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		
		System.out.println("Size = "+link.size());
		
		
		for(int i=0;i<link.size();i++)
		{
			System.out.println(link.get(i).getText());
		}
	
		
		for(int i=0;i<link.size();i++)
		{
			String ex = "Images";
			String ac = link.get(i).getText();
			if(ex.equals(ac))
			{
				link.get(i).click();
				System.out.println("Click Link = "+ac);
				break;
			}
			
		}
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.close();
	}

}
