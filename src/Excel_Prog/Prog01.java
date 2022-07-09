package Excel_Prog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog01 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
	
		FileInputStream ex = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Velocity_Selenium\\Excel_Files\\asd.xlsx");
		// generate FileNotFoundException
		
		Sheet sh = WorkbookFactory.create(ex).getSheet("Sheet1"); // generated EncryptedDocumentException
	
		WebElement FN = driver.findElement(By.xpath("//input[@id='fullname']"));
		FN.sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='emailid']"));
		mail.sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		
		
		
		
	
	}

}
