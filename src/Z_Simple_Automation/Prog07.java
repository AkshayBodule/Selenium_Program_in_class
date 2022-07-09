package Z_Simple_Automation;
// All Locators and Xpath 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog07 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
	
		//Locator = Tagname
//		WebElement tgname = driver.findElement(By.tagName("input"));
//		tgname.sendKeys("One Piece");
		
		//Locator = ID
//		WebElement id = driver.findElement(By.id("fullname"));
//		id.sendKeys("Google");
	
		//Locator = Class Name
		WebElement clsname = driver.findElement(By.className("txtbox1"));
		clsname.sendKeys("DBZ");
		
		//xPath by index
//		WebElement index = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		index.sendKeys("Akki");
		
		//xPath by Contains
		WebElement cntain = driver.findElement(By.xpath("//input[contains(@name,'emailid')]"));
		cntain.sendKeys("Death Note");
		
		//xPath by Attribute
		WebElement atribt = driver.findElement(By.xpath("//input[@id='signup_city']"));
		atribt.sendKeys("Akshay Bodule");
		
		Thread.sleep(3000);
		//xPath by text
		WebElement txt = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
		txt.click();
		
		
		// Locator = normalize Space xpath
//		WebElement txt = driver.findElement(By.xpath("//button[normalize-space(text())='Select']"));
		
		
		//Locator = linktext
//		WebElement linktext = driver.findElement(By.linkText("CompeteLinkText"));
//		linktext.click();
		
		//Locator = partialLinkText
//		driver.findElement(By.partialLinkText("Complete"));
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
