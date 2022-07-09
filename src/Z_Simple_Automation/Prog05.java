package Z_Simple_Automation;
// xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog05 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrivr.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[@maxlength='61']")).sendKeys("Akshay Bodule");
		driver.findElement(By.xpath("//input[@name='login83435828']")).sendKeys("akshaybodule");
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
