package JavaPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class RedBus {
	public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement element1= driver.findElement(By.id("src"));
	element1.sendKeys("Hyderabad");
	WebElement element2= driver.findElement(By.id("dest"));
	element2.sendKeys("Visakhapatnam");
	
}
}
