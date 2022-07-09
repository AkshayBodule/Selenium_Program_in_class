package Z_Simple_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog03 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.codingninjas.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		String check = driver.getTitle();			// to check Title of web pages
		String customergives = "Coding Ninjas – Learn coding online at India’s best coding institute";	// BA gives to check
		if(check.equals(customergives))				// comparing 
		{
			System.out.println("Title is Passed");
		}
		else
		{
			System.out.println("Title is Failed");
		}
		System.out.println(driver.getCurrentUrl());
		String a = driver.getCurrentUrl();		// to check Web page URL
		String b = "https://www.codingninjas.com/";
		if(a.equals(b))
		{
			System.out.println("Url is Passed");
		}
		else
		{
			System.out.println("Url is Failed");
		}
		
		Thread.sleep(5000);
		driver.close();

	}

}
