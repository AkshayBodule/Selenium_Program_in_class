package Simple_Program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog04 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement list = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s= new Select(list);
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Audi");
		
		List<WebElement> getx = s.getAllSelectedOptions();
		
		for(WebElement op:getx)
		{
			System.out.println(op.getText());
		}
/*
		for(int i =0;i<getx.size();i++)
		{
			System.out.println(getx.get(i).getText());
		}
*/
		WebElement m = s.getFirstSelectedOption();
		System.out.println(m.getText());
		
		Thread.sleep(3000);
		driver.close();
	}

}
