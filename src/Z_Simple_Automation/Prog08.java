package Z_Simple_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Status Of Elements
public class Prog08 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://megrecruitment.nic.in/rpa/register.htm");
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='emailid']"));
		System.out.println("IsDisplay = "+emailId.isDisplayed());
		System.out.println("IsEnable = "+emailId.isEnabled());
		System.out.println("IsSelected = "+emailId.isSelected());
		System.out.println("---------------------------------------");
		
		emailId.sendKeys("abc@def");
		System.out.println("IsDisplay = "+emailId.isDisplayed());
		System.out.println("IsEnable = "+emailId.isEnabled());
		System.out.println("IsSelected = "+emailId.isSelected());
		System.out.println("---------------------------------------");
		
		WebElement husbandName = driver.findElement(By.xpath("//input[@id='husbandsname']"));
		System.out.println("IsDisplay = "+husbandName.isDisplayed());
		System.out.println("IsEnable = "+husbandName.isEnabled());
		System.out.println("IsSelected = "+husbandName.isSelected());
		
		Thread.sleep(3000);
		driver.close();
	}

}
