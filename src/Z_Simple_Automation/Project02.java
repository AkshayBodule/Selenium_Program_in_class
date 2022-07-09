package Z_Simple_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project02 {

	public static void main(String[] args) throws InterruptedException {
		int count=0;
		System.setProperty("webdriver.chrome.driver", "chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		
		
		WebElement redifflink = driver.findElement(By.xpath("//a[@title='Rediff.com Home']"));
		WebElement rediffimgLable = driver.findElement(By.xpath("//img[@class='halflogo']"));
		WebElement newUserLable = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement tellUsLable = driver.findElement(By.xpath("//p[@class='grey1']"));
		WebElement yourFullNameLable = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		WebElement yourCurrentEmailIdLable = driver.findElement(By.xpath("//div[text()='Your current email ID']"));
		WebElement egCurrentEmailIdLable = driver.findElement(By.xpath("//p[@class='sm1 grey1']"));
		WebElement newPasswordLable = driver.findElement(By.xpath("//div[text()='New password']"));
		WebElement retypePasswordLable = driver.findElement(By.xpath("//div[text()='Retype password']"));
		WebElement genderLable = driver.findElement(By.xpath("//div[text()='Gender:']"));

		WebElement dateOfBirthLable = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
		WebElement locationLable = driver.findElement(By.xpath("//div[text()='Location']"));
		WebElement schoolLable = driver.findElement(By.xpath("//div[text()='School']"));
		WebElement collegeLable = driver.findElement(By.xpath("//div[text()='College']"));
		WebElement enterCodeLable = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
		WebElement rediffLable = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
		WebElement investorLable = driver.findElement(By.xpath("//a[text()='Investor Information']"));
		WebElement advertiseLable = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
		WebElement disclaimerLable = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
		WebElement privacyPolicyLable = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebElement feedbackLable = driver.findElement(By.xpath("//a[text()='Feedback']"));
		WebElement termsOfUseLable = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		
		WebElement FullNameTextBox = driver.findElement(By.xpath("//input[@id='fullname']"));
		FullNameTextBox.sendKeys("Akshay Bodule");
		if(FullNameTextBox.isDisplayed())
		{
			count++;
			System.out.println("Full Name TextBox is \t\t\t Available");
		}
		else
		{
			System.out.println("Full Name TextBox is \t\t\t Not Available");
		}
		WebElement YourcurrentEmailIdTextBox = driver.findElement(By.xpath("//input[@id='emailid']"));
		YourcurrentEmailIdTextBox.sendKeys("amb@gmail.com");
		if(YourcurrentEmailIdTextBox.isDisplayed())
		{
			count++;
			System.out.println("Your current EmailId TextBox is \t Available");
		}
		else
		{
			System.out.println("Your current EmailId TextBox is \t Not Available");
		}
		
		WebElement NewPassTextBox = driver.findElement(By.xpath("//input[@id='pass']"));
		NewPassTextBox.sendKeys("abc123");
		if(NewPassTextBox.isDisplayed())
		{
			count++;
			System.out.println("New Password TextBox is \t\t Available");
		}
		else
		{
			System.out.println("New Password TextBox is \t\t Not Available");
		}
		
		WebElement RetypePassTextBox = driver.findElement(By.xpath("//input[@id='repass']"));
		RetypePassTextBox.sendKeys("abc123");
		if(RetypePassTextBox.isDisplayed())
		{
			count++;
			System.out.println("Retype Password TextBox is \t\t Available");
		}
		else
		{
			System.out.println("Retype Password TextBox is \t\t Not Available");
		}
		
		WebElement GenderMaleRadioButton = driver.findElement(By.xpath("//input[@id='sex']"));
		GenderMaleRadioButton.click();
		if(GenderMaleRadioButton.isDisplayed())
		{
			count++;
			System.out.println("Gender Male Radio Button is \t\t Available");
		}
		else
		{
			System.out.println("Gender Male Radio Button is \t\t Not Available");
		}
		
		WebElement GenderFemaleRadioButton = driver.findElement(By.xpath("//input[contains(@value,'f')]"));
		if(GenderFemaleRadioButton.isDisplayed())
		{
			count++;
			System.out.println("Gender Female Radio Button is \t\t Available");
		}
		else
		{
			System.out.println("Gender Female Radio Button is \t\t Not Available");
		}
		
		WebElement dobDays = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s = new Select(dobDays);
		s.selectByVisibleText("10");
		if(dobDays.isDisplayed())
		{
			count++;
			System.out.println("DOB Days is \t\t\t\t Available");
		}
		else
		{
			System.out.println("DOB Days is \t\t\t\t Not Available");
		}
		
		WebElement dobMonths = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select s1 = new Select(dobMonths);
		s1.selectByVisibleText("OCT");
		if(dobMonths.isDisplayed())
		{
			count++;
			System.out.println("DOB Months is \t\t\t\t Available");
		}
		else
		{
			System.out.println("DOB Days is \t\t\t\t Not Available");
		}
		
		WebElement dobYears = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s2 = new Select(dobYears);
		s2.selectByVisibleText("1995");
		if(dobYears.isDisplayed())
		{
			count++;
			System.out.println("DOB Years is \t\t\t\t Available");
		}
		else
		{
			System.out.println("DOB Years is \t\t\t\t Not Available");
		}
		
		Thread.sleep(2000);
		WebElement LocationTextBox = driver.findElement(By.xpath("//input[@id='signup_city']"));
		LocationTextBox.sendKeys("Nagpur");
		if(LocationTextBox.isDisplayed())
		{
			count++;
			System.out.println("Location TextBox is \t\t\t Available");
		}
		else
		{
			System.out.println("Location TextBox is \t\t\t Not Available");
		}
		
		WebElement SchoolTextBox = driver.findElement(By.xpath("//input[@id='school']"));
		SchoolTextBox.sendKeys("Sharda Convent School");
		if(SchoolTextBox.isDisplayed())
		{
			count++;
			System.out.println("School TextBox is \t\t\t Available");
		}
		else
		{
			System.out.println("School TextBox is \t\t\t Not Available");
		}
		
		WebElement CollegeTextBox = driver.findElement(By.xpath("//input[@id='college']"));
		CollegeTextBox.sendKeys("DRGIT&R");
		if(CollegeTextBox.isDisplayed())
		{
			count++;
			System.out.println("College TextBox is \t\t\t Available");
		}
		else
		{
			System.out.println("College TextBox is \t\t\t Not Available");
		}
		
		WebElement EntertheCodeTextBox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		EntertheCodeTextBox.sendKeys("19697");
		if(EntertheCodeTextBox.isDisplayed())
		{
			count++;
			System.out.println("Captcha TextBox is \t\t\t Available");
		}
		else
		{
			System.out.println("Captcha TextBox is \t\t\t Not Available");
		}
		
		
				
		
		if(redifflink.isDisplayed())
		{
			count++;
			System.out.println("Rediff link is \t\t\t\t Available");
		}
		else
		{
			System.out.println("Rediff link is \t\t\t\t Not available");
		}
		
		if(rediffimgLable.isDisplayed())
		{
			count++;
			System.out.println("Rediff Logo is \t\t\t\t Available");
		}
		else
		{
			System.out.println("Rediff logo is \t\t\t\t Not available");
		}
		if(newUserLable.isDisplayed())
		{
			count++;
			System.out.println("New User is \t\t\t\t Available");
		}
		else
		{
			System.out.println("New User is \t\t\t\t Not available");
		}
		if(tellUsLable.isDisplayed())
		{
			count++;
			System.out.println("Tell us... is \t\t\t\t Available");
		}
		else
		{
			System.out.println("Tell us... is \t\t\t\t Not available");
		}
		if(yourFullNameLable.isDisplayed())
		{
			count++;
			System.out.println("Your Full Name is \t\t\t Available");
		}
		else
		{
			System.out.println("Your Full Name is \t\t\t Not available");
		}
		if(yourCurrentEmailIdLable.isDisplayed())
		{
			count++;
			System.out.println("Your Current Email Id is \t\t Available");
		}
		else
		{
			System.out.println("Your Current Email Id is \t\t Not available");
		}
		
		if(egCurrentEmailIdLable.isDisplayed())
		{
			count++;
			System.out.println("Your eg. current Email Id is \t\t Available");
		}
		else
		{
			System.out.println("Your eg. current Email Id is \t\t Not available");
		}
		
		if(newPasswordLable.isDisplayed())
		{
			count++;
			System.out.println("New Password is \t\t\t Available");
		}
		else
		{
			System.out.println("New Password is \t\t\t not available");
		}
		if(retypePasswordLable.isDisplayed())
		{
			count++;
			System.out.println("Retype Password is \t\t\t Available");
		}
		else
		{
			System.out.println("Retype Password is \t\t\t not available");
		}
		if(genderLable.isDisplayed())
		{
			count++;
			System.out.println("Gender is \t\t\t\t Available");
		}
		else
		{
			System.out.println("Gender is \t\t\t\t Not available");
		}
		if(dateOfBirthLable.isDisplayed())
		{
			count++;
			System.out.println("Date Of Birth is \t\t\t Available");
		}
		else
		{
			System.out.println("Date Of Birth is \t\t\t Not available");
		}
		if(locationLable.isDisplayed())
		{
			count++;
			System.out.println("Location is \t\t\t\t Available");
		}
		else
		{
			System.out.println("Location is \t\t\t\t Not available");
		}
		
		if(schoolLable.isDisplayed())
		{
			count++;
			System.out.println("School is \t\t\t\t Available");
		}
		else
		{
			System.out.println("School is \t\t\t\t Not Available");
		}
		
		if(collegeLable.isDisplayed())
		{
			count++;
			System.out.println("College is \t\t\t\t Available");
		}
		else
		{
			System.out.println("College is \t\t\t\t Not Available");
		}
		
		if(enterCodeLable.isDisplayed())
		{
			count++;
			System.out.println("Enter Code is \t\t\t\t Available");
		}
		else
		{
			System.out.println("Enter Code is \t\t\t\t Not Available");
		}
			
		if(rediffLable.isDisplayed())
		{
			count++;
			System.out.println("Rediff Lable is \t\t\t Available");
		}
		else
		{
			System.out.println("Rediff Lable is \t\t\t Not Available");
		}
		
		if(investorLable.isDisplayed())
		{
			count++;
			System.out.println("Investor Lable is \t\t\t Available");
		}
		else
		{
			System.out.println("Investor Lable is \t\t\t not Available");
		}
		
		if(advertiseLable.isDisplayed())
		{
			count++;
			System.out.println("Advertise Lable is \t\t\t Available");
		}
		else
		{
			System.out.println("Advertise Lable is \t\t\t Not Available");
		}
		
		if(disclaimerLable.isDisplayed())
		{
			count++;
			System.out.println("Disclaimer Lable is \t\t\t Available");
		}
		else
		{
			System.out.println("Disclaimer Lable is \t\t\t Not Available");
		}
		
		if(privacyPolicyLable.isDisplayed())
		{
			count++;
			System.out.println("Privacy Policy Lable is \t\t Available");
		}
		else
		{
			System.out.println("Privacy Policy Lable is \t\t Not Available");
		}
		
		if(feedbackLable.isDisplayed())
		{
			count++;
			System.out.println("FeedBack Lable is \t\t\t Available");
		}
		else
		{
			System.out.println("FeedBack Lable is \t\t\t Not Available");
		}
		
		if(termsOfUseLable.isDisplayed())
		{
			count++;
			System.out.println("Terms of Use Lable is \t\t\t Available");
		}
		else
		{
			System.out.println("Terms of Use Lable is \t\t\t Not Available");
		}

		WebElement SignUpButton = driver.findElement(By.xpath("//input[@id='btn_register']"));
		if(SignUpButton.isDisplayed())
		{
			count++;
			System.out.println("SigUp Button is \t\t\t Available");
		}
		else
		{
			System.out.println("SigUp Button is \t\t\t Not Available");
		}
		
		SignUpButton.click();
	
			
		System.out.println("No of Elements = "+count);
		
		driver.close();
	}

}
