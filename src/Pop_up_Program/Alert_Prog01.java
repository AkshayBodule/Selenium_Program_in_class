package Pop_up_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Prog01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement signIn = driver.findElement(By.xpath("//input[@value='Sign in']"));
		signIn.click();
		
		Alert popup = driver.switchTo().alert();
		String msg = popup.getText();
		System.out.println(msg);
		Thread.sleep(2000);
		popup.accept();
		
		
		Thread.sleep(3000);
		driver.close();
	
	
	}

}
