package Action_class_Program;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xml.security.stax.ext.XMLSecurityConstants.Action;
import org.checkerframework.checker.units.qual.mol;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog01 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		
		FileInputStream at = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Velocity_Selenium\\Excel_Files\\asd.xlsx");
		Sheet sh = WorkbookFactory.create(at).getSheet("sheet2");
		
		WebElement UserNameTextBox = driver.findElement(By.xpath("//input[@id='username-id']"));
		UserNameTextBox.sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		String un = UserNameTextBox.getAttribute("value"); // to get the String in TextBox
		System.out.println("User Name = "+un);
		
		
		WebElement PasswordTextBox = driver.findElement(By.xpath("//input[@id='usr_pwd']"));
		PasswordTextBox.sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		String pass = PasswordTextBox.getAttribute("value");
		System.out.println("Password = "+pass);
		
		WebElement ConfirmPasswordTextBox = driver.findElement(By.xpath("//input[@id='cnfm_pass']"));
		ConfirmPasswordTextBox.sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		String cPass = ConfirmPasswordTextBox.getAttribute("value");
		System.out.println("Confirm Password = "+cPass);
		
		WebElement MobileNumberTextBox = driver.findElement(By.xpath("//input[@id='user-number']"));
		MobileNumberTextBox.sendKeys(sh.getRow(2).getCell(0).getStringCellValue());
		String mobno = MobileNumberTextBox.getAttribute("value");
		System.out.println("Mobile Number = "+mobno);
		
		WebElement EmailIdTextBox = driver.findElement(By.xpath("//input[@id='email_id']"));
		EmailIdTextBox.sendKeys(sh.getRow(3).getCell(0).getStringCellValue());
		String email = EmailIdTextBox.getAttribute("value");
		System.out.println("Email Id = "+email);
		
/*		
		//==========================================================
		//Scroll down Code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)");
		
		//===========================================================
*/		 
		WebElement SelectList = driver.findElement(By.xpath("//button[normalize-space(text())='Select']"));
	
		Actions a = new Actions(driver);	
		a.sendKeys(Keys.PAGE_DOWN).build().perform();	// Scroll down with the help of Actions class
		Thread.sleep(2000);
		a.moveToElement(SelectList).click().build().perform();
		Thread.sleep(3000);
		
		for(int i=0;i<8;i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		
		a.sendKeys(Keys.ENTER).build().perform();		
		System.out.println(SelectList.getText());
		
		WebElement SecurityAnswerTextBox = driver.findElement(By.xpath("//input[@id='sec_ans_field']"));
		SecurityAnswerTextBox.sendKeys(sh.getRow(4).getCell(0).getStringCellValue());
		String sa = SecurityAnswerTextBox.getAttribute("value");
		System.out.println("Security Answer = "+sa);
		
		Thread.sleep(3000);
		driver.close();
	}

}