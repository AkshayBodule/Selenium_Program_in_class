package Z_Simple_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project01 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(1500);
		WebElement yourFullName = driver.findElement(By.xpath("//input[@id='fullname']"));
		yourFullName.sendKeys("Akshay Mohanlal Bodule");
		
		Thread.sleep(1500);
		WebElement yourCurrentEmailId = driver.findElement(By.xpath("//input[@id='emailid']"));
		yourCurrentEmailId.sendKeys("amb@gmail.com");
		Thread.sleep(1500);
		
		WebElement newPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		newPassword.sendKeys("abcd@123");
		
		Thread.sleep(1500);
		WebElement retypePass = driver.findElement(By.xpath("//input[@id='repass']"));
		retypePass.sendKeys("abcd@123");
		
		Thread.sleep(1500);
		WebElement gender = driver.findElement(By.xpath("//input[@id='sex']"));
		gender.click();
		
		Thread.sleep(1500);
		WebElement dob1 = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s1 = new Select(dob1);
		s1.selectByVisibleText("10");
		
		Thread.sleep(1500);
		WebElement dob2 = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select s2 = new Select(dob2);
		s2.selectByVisibleText("OCT");
		
		Thread.sleep(1500);
		WebElement dob3 = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s3 =new Select(dob3);
		s3.selectByVisibleText("1995");
		
		Thread.sleep(1500);
		WebElement location = driver.findElement(By.xpath("//input[@id='signup_city']"));
		location.sendKeys("Nagpur");

		Thread.sleep(1500);
		WebElement school = driver.findElement(By.xpath("//input[@id='school']"));
		school.sendKeys("Sharda Convent School");
		
		Thread.sleep(1500);
		WebElement college = driver.findElement(By.xpath("//input[@id='college']"));
		college.sendKeys("DRGIT&R");
		
		Thread.sleep(1500);
		WebElement captcha = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		captcha.sendKeys("45628");
		Thread.sleep(1500);
		
		WebElement signInButton = driver.findElement(By.xpath("//input[@id='btn_register']"));
		signInButton.click();
		
			
		
		
		Thread.sleep(1500);
		driver.close();
	}

}
