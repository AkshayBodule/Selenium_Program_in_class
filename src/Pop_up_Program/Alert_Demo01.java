package Pop_up_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement SignInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		SignInBtn.click();
		
		Alert alt = driver.switchTo().alert();
		String str = alt.getText();
		System.out.println(str);
		Thread.sleep(2000);
		alt.accept();
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
