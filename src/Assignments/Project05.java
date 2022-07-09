package Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Child Browser POPUP
public class Project05 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		WebElement newWindowBtn = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newWindowBtn.click();
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> itr = window.iterator();
		
		String win[] = new String[10];
		
		for(int i=0;i<window.size();i++)
		{
			win[i]= itr.next();		//0= m , 1 =c
			System.out.println(win[i]);
		}
		
		driver.switchTo().window(win[1]);
		driver.manage().window().maximize();
		WebElement search1 = driver.findElement(By.xpath("//i[@class=' mw-icon the7-mw-icon-search-bold']"));
		search1.click();
		
		WebElement searchtext = driver.findElement(By.xpath("//input[@class='field searchform-s']"));
		searchtext.sendKeys("Selenium");
		
		WebElement searchClick = driver.findElement(By.xpath("//i[@class='the7-mw-icon-search-bold']"));
		searchClick.click();
		Thread.sleep(1500);
		driver.navigate().back();
		
		
		WebElement searchText2 = driver.findElement(By.xpath("//input[@id='the7-search']"));
		searchText2.sendKeys("Java");
		
		WebElement searchClick1 = driver.findElement(By.xpath("//a[@class='submit']"));
		searchClick1.click();
		Thread.sleep(1500);
		driver.navigate().back();
		
		driver.quit();
	}

}
