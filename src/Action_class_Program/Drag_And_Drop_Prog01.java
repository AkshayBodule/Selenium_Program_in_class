package Action_class_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Prog01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	    WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);
		WebElement image1 = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
	
		Actions a = new Actions(driver);
		
		Thread.sleep(1000);
		a.moveToElement(image1).clickAndHold().moveToElement(trash).release().build().perform();
		Thread.sleep(1000);
		a.moveToElement(image2).clickAndHold().moveToElement(trash).release().build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(image3, trash).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(image4, trash).build().perform();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
