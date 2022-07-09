package Pop_up_Program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup_Prog01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		
		WebElement popUpBtn = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		popUpBtn.click();
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> itr = window.iterator();
		
		String win[] = new String[10];
		
		System.out.println(window.size());
		
		for(int i=0;i<window.size();i++)
		{
			win[i] = itr.next();
			System.out.println(win[i]);
		}
		
		driver.switchTo().window(win[0]);
		System.out.println("Title 1= "+ driver.getTitle());
		System.out.println("URL = "+ driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(win[1]);
		System.out.println("Title 2 = "+driver.getTitle());
		System.out.println("Url = "+ driver.getCurrentUrl());
		WebElement FirstName = driver.findElement(By.xpath("//td[contains(text(),'First')]"));
		System.out.println(FirstName.getText());
		WebElement LastName = driver.findElement(By.xpath("//td[contains(text(),'Last')]"));
		System.out.println(LastName.getText());
		driver.close();
		

		
		
		
	//	driver.quit();
		
		
		
	}

}
