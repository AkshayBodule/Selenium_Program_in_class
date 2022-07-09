package Assignments;

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
import org.openqa.selenium.support.ui.Select;

public class Project04 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		FileInputStream source = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Velocity_Selenium\\Excel_Files\\Book1.xlsx"); 
		Sheet excel = WorkbookFactory.create(source).getSheet("Sheet1");
		
		
		WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='user-name']"));
		userNameTextBox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		
		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='password']"));
		passwordTextBox.sendKeys(excel.getRow(1).getCell(0).getStringCellValue());
		
		Thread.sleep(1500);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		
		Thread.sleep(3000);
		WebElement filterList = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
		Select s1 = new Select(filterList);
		s1.selectByVisibleText("Price (low to high)");
		
		Thread.sleep(1500);
		WebElement product1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
		product1.click();
		
		Thread.sleep(1500);
		WebElement cartLogo = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartLogo.click();
		
		Thread.sleep(1500);
		WebElement removeButton = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']"));
		removeButton.click();
		
		Thread.sleep(1500);
		WebElement continueButton = driver.findElement(By.xpath("//button[@id='continue-shopping']"));
		continueButton.click();
		
		Thread.sleep(1500);
		WebElement filterList1 = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select s2 = new Select(filterList1);
		s2.selectByVisibleText("Price (low to high)");

		Thread.sleep(1500);
		WebElement product2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		product2.click();
		
		Thread.sleep(1500);
		WebElement cartLogo1 = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartLogo1.click();
		
		Thread.sleep(1500);
		WebElement checkoutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
		checkoutButton.click();
		
		Thread.sleep(1500);
		WebElement fnameTextBox = driver.findElement(By.xpath("//input[@id='first-name']"));
		fnameTextBox.sendKeys(excel.getRow(2).getCell(0).getStringCellValue());
		
		Thread.sleep(1500);
		WebElement lnameTextBox = driver.findElement(By.xpath("//input[@id='last-name']"));
		lnameTextBox.sendKeys(excel.getRow(3).getCell(0).getStringCellValue());
		
		Thread.sleep(1500);
		WebElement zipCodeTextBox = driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipCodeTextBox.sendKeys(excel.getRow(4).getCell(0).getStringCellValue());
		
		Thread.sleep(1500);
		WebElement continueButton1 = driver.findElement(By.xpath("//input[@id='continue']"));
		continueButton1.click();
		
		Thread.sleep(1500);
		WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
		finishButton.click();
		
		Thread.sleep(1500);
		WebElement menuButton = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menuButton.click();
		
		Thread.sleep(1500);
		WebElement logoutButton = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logoutButton.click();
		
		Thread.sleep(1500);
		WebElement userNameTextBox1 = driver.findElement(By.xpath("//input[@id='user-name']"));
		userNameTextBox1.sendKeys(excel.getRow(5).getCell(0).getStringCellValue());
		
		WebElement passwordTextBox1 = driver.findElement(By.xpath("//input[@id='password']"));
		passwordTextBox1.sendKeys(excel.getRow(1).getCell(0).getStringCellValue());
		
		Thread.sleep(1500);
		WebElement loginButton1 = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton1.click();
		
		Thread.sleep(1500);
		WebElement errorMsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		System.out.println(errorMsg.getText());
		
		Thread.sleep(3000);
		driver.close();
	}

}
