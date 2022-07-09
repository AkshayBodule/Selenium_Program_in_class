package Handle_WebTable_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices/nse?src=moneyhome_nseIndices_more");
		
		WebElement showmoreclk = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showmoreclk.click();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='dataTable']//tr"));
		
		System.out.println("ROW size = "+row.size());
		
		for(int i=0;i<row.size();i++)
		{
			System.out.println(row.get(i).getText());
		}

		
		Thread.sleep(3000);
		driver.close();
	}

}
