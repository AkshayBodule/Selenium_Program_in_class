package Pop_up_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Prog02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
/*		
		WebElement clickbtn1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickbtn1.click();
		
		Alert pop1 = driver.switchTo().alert();
		String msg1 = pop1.getText();
		System.out.println(msg1);
		Thread.sleep(3000);
		pop1.accept();
*/	

/*		
		WebElement AlertwithOk = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		AlertwithOk.click();
		Thread.sleep(1000);
		WebElement clickbtn2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickbtn2.click();
		Thread.sleep(1000);
		Alert pop2 = driver.switchTo().alert();
		String msg2 = pop2.getText();
		System.out.println(msg2);
		Thread.sleep(2000);
	//	pop2.accept();
		pop2.dismiss();
*/
		
		
		WebElement AlertwithTextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		AlertwithTextbox.click();
		Thread.sleep(1000);
		WebElement clickbtn3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		clickbtn3.click();
		Alert pop3 = driver.switchTo().alert();
		String msg3 = pop3.getText();
		System.out.println(msg3);
		Thread.sleep(2000);
		pop3.sendKeys("Micky Mouse");
		Thread.sleep(2000);
		pop3.accept();
//		pop3.dismiss();
		
		Thread.sleep(3000);
		driver.close();
	}

}
