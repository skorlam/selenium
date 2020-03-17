package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");

		// Find the radio button for �No� using its ID and click on it
		driver.findElement(By.id("no")).click();
			
		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();
	}
}
