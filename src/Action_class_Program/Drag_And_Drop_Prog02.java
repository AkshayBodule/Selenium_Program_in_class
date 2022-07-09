package Action_class_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Prog02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		WebElement D5000 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable'][1]"));
		WebElement D1Textbox1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		WebElement C5000 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement C1TextBox1 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement D1Textbox2 = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		WebElement Sales = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement C1TextBox2 = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		// 1st method drag and drop... we have say in interview
		a.moveToElement(D5000).clickAndHold().moveToElement(D1Textbox1).release().build().perform();
		// 2nd method drag and drop
		Thread.sleep(1000);
		a.dragAndDrop(C5000,C1TextBox1).build().perform();
		
		Thread.sleep(1000);
		a.moveToElement(bank).clickAndHold().moveToElement(D1Textbox2).release().build().perform();
		
		Thread.sleep(1000);
		a.moveToElement(Sales).clickAndHold().moveToElement(C1TextBox2).release().build().perform();
		Thread.sleep(1000);
		WebElement perfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		
		
		System.out.println(perfect.getText());
		Thread.sleep(3000);
		driver.close();
	}

}
