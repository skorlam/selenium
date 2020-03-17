package demo.Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://hdfcbankprepaid.hdfcbank.com/hdfcportal/index");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String expectedUrl="https://hdfcbankprepaid.hdfcbank.com/hdfcportal/index";
		Assert.assertEquals(expectedUrl, url);
	
		if(expectedUrl.equals(url)==true)
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is not passed");
		}
		
		WebElement username = driver.findElement(By.name("username"));
		boolean display1 = username.isDisplayed();
		boolean enable1 = username.isEnabled();
		
		System.out.println("User is Displayed = " + display1);
		System.out.println("User is Enabled =  " + enable1);
		username.sendKeys("satyajit2412");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.name("password"));
		boolean display2 = password.isDisplayed();
		boolean enable2 = password.isEnabled();
		System.out.println("Password is Displayed = " + display2);
		System.out.println("Password is Enabled = " + enable2);
		password.sendKeys("PINKu@2407");
		
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		String ExpectedLoginUrl = "https://hdfcbankprepaid.hdfcbank.com/hdfcportal/customer/loginAuth";
		String ActualLoginUrl = driver.getCurrentUrl();
		
		if(ExpectedLoginUrl.equals(ActualLoginUrl)==true) {
			System.out.println("LogIn is successful");
		}
		
		Thread.sleep(5000);
		
		WebElement logOut = driver.findElement(By.linkText("Logout"));
		logOut.click();
		Thread.sleep(3000);
		String ExpectedLogOutUrl = "https://hdfcbankprepaid.hdfcbank.com/hdfcportal/login.html?logout=logout";
		String ActualLogOutUrl = driver.getCurrentUrl();
		System.out.println(ActualLogOutUrl);
		
		if(ExpectedLogOutUrl.equals(ActualLogOutUrl)==true)
		{
			System.out.println("LogOut is successful");
		}
		
		else
		{
			System.out.println("LogOut is not successful");
		}
		driver.close();
	}

}
