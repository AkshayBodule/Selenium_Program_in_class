package Pop_up_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement clkBtn1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		clkBtn1.click();
		
		Alert alt1 = driver.switchTo().alert();
		String str1 = alt1.getText();
		System.out.println("PopUp 1 = "+ str1);
		alt1.accept();
		
		 WebElement AlertwithOKCancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		AlertwithOKCancel.click();
		WebElement clkBtn2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		clkBtn2.click();
		Alert alt2 = driver.switchTo().alert();
		String str2 = alt2.getText();
		System.out.println("PopUp 2 = "+str2);
	//	alt2.accept();
		alt2.dismiss();
		
		
		WebElement AlertwithTextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")); 
		AlertwithTextbox.click();
		WebElement clkBtn3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		clkBtn3.click();
		Alert alt3 = driver.switchTo().alert();
		String str3 = alt3.getText();
		alt3.sendKeys("Shaktiman");
		System.out.println(str3);
		alt3.accept();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
