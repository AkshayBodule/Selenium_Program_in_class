package Scroll_Down_Up_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Prog01 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.msedge.driver","msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=perf_bing_traffic&utm_medium=perf_bing_traffic&utm_campaign=Bing_Brand_BMM_Desktop&utm_source=bing&msclkid=82311c60915a187411d47ef70e6c453d&utm_term=%2Bmyntra.&utm_content=Myntra_Generic");
		
		WebElement down = driver.findElement(By.xpath("//p[text()=' Registered Office Address ']"));
		
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		// 1 step is for to scroll down to given size
//		js.executeScript("window.scrollBy(0,4000)");
		
		// 2 step is for to scroll down to given specific xpath
//		js.executeScript("arguments[0].scrollIntoView()",down);
	
		// 3 step is for scroll down to 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.close();
	}

}
