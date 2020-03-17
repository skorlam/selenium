package demo.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Url is " +driver.getCurrentUrl());
		String ExpectedUrl = "https://www.google.com/";
		String ActualUrl = driver.getCurrentUrl();
		if (ExpectedUrl.equals(ActualUrl)==true) {
			System.out.println("Open Url is Correct");
		}
		else
		{
			System.out.println("Open Url is not Correct");
		}
		
		System.out.println("Search Box Displayed "+driver.findElement(By.name("q")).isDisplayed());		
		driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
		System.out.println("Search is Enabled "+ driver.findElement(By.name("btnK")).isEnabled());
		System.out.println("Submit is Avaiable"+ driver.findElement(By.xpath("//input[@value='Google Search']")).isEnabled());
		driver.findElement(By.xpath("//input[@value='Google Search']")).submit(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Page Title is  "+ driver.getTitle());
		driver.navigate().back();
		System.out.println("Page Title is  "+ driver.getTitle());
		driver.navigate().forward();
		System.out.println("Page Title is  "+ driver.getTitle());
		driver.close();
	}

}
