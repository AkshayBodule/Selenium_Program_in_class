package Handle_WebTable_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog01 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://money.rediff.com/index.html");
	
//	JavascriptException scroll = (JavascriptException)driver;
//	scroll.exceuteScript("window.scrollBy(0,1000)");
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;  
//	js.executeScript(Script,Arguments);
	
	WebElement title = driver.findElement(By.xpath("//b[text()='NSE INDICES']"));
	System.out.println("Name of Table = "+title.getText());
	
	List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmnseindicestable']//ul"));
	
	List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmnseindicestable']//ul[1]//li"		/*"//div[@class='hmnseindicestable']//ul//li"*/));
	
	System.out.println("row size = "+ row.size());
	
	System.out.println("column Size = "+ column.size());
	
	for(int i=0;i<row.size();i++)
	{
		System.out.println(row.get(i).getText());
	}
	
	Thread.sleep(3000);
	driver.close();
	}
}
