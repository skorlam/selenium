package demo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		
		//FirstName
		driver.findElement(By.name("firstname")).sendKeys("Satyajit");
		
		//LastName
		driver.findElement(By.name("lastname")).sendKeys("korlam");
		
		//Email Number
		driver.findElement(By.name("reg_email__")).sendKeys("korlamsatyajit@gmail.com");
		
		//ReEnter Email
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("korlamsatyajit@gmail.com");
		
		//Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd@1234");
		//System.out.println("Passowrd is "+driver.findElement(By.name("reg_passwd__")).getText());
		
		//Gender Male
		driver.findElement(By.cssSelector("input[value='2']")).click();
		
				
		//Selecting Date Of Birth
		
		//Month Selected
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("24");
		
		
		//Month Selected
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Jul");
				
		//year Selected
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1987");
		
	}

}
