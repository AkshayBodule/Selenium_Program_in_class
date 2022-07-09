package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog02 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in/?afid=p238%7CsdUuvv563-dc_mtid_187079nc38483_pcrid_605630655488_pgrid_109516736379_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
		Thread.sleep(2000);
		
		Date date = new Date();
		String date1 = date.toString().replace(" ", "_").replace(":", "-");
		System.out.println(date1);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Velocity_Selenium\\ScreenShots\\"+date1+".jpg");
		FileHandler.copy(source, dest);
		
		driver.close();
	}

}
