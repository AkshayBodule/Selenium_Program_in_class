package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog01 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		// returntype= OutputType
		System.out.println(source);
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Velocity_Selenium\\ScreenShots\\asd.jpeg");
		FileHandler.copy(source, destination); // generate IOException
		
		driver.close();
	}

}
