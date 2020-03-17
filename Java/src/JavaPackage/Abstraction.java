package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstraction  {
	WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		
		Abstraction abstraction = new Abstraction();
		abstraction.login();
		Thread.sleep(5000);
		abstraction.logout();
		
	}
			
		public void login() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
			//Openning Website
			driver.get("https://www.hrberry.com/smarthr/index.php?q=cms&m=index&client=atmecs");
			
			Thread.sleep(5000);
			
			//Typing UserName
			driver.findElement(By.name("userid")).sendKeys("796");
			
			//Typing Password
			driver.findElement(By.id("password")).sendKeys("AbCD@1234");
			
			//Click on Login
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
		 }
	
		public void logout()
		{
			//Click on Logout
			driver.findElement(By.linkText("Logout")).click();
			
		}
	
				
	}


