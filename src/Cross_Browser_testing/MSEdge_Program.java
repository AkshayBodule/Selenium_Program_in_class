package Cross_Browser_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MSEdge_Program {

	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}

}
