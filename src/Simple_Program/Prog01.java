package Simple_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		String r = driver.getTitle();
		System.out.println("Title = "+ r);
		
		System.out.println("Url "+ driver.getCurrentUrl());
		
		
		
		
	//	Thread.sleep(6000);
		driver.close();
	}

}
