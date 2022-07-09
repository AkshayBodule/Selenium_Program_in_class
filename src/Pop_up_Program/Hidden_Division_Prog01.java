package Pop_up_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hidden_Division_Prog01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement createbtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createbtn.click();
		
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Light");
		Thread.sleep(1000);
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Yagami");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("Hokage@leaf");
		Thread.sleep(1000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("NineTailFox");
		Thread.sleep(1000);
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1 = new Select(date);
		s1.selectByVisibleText("10");
		Thread.sleep(1000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Oct");
		Thread.sleep(1000);

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1995");
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		
		WebElement signUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signUp.click();
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
