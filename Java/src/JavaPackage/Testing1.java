package JavaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1 {
	public static void main (String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		WebElement link;
		Thread.sleep(50000);
		link = driver.findElement(By.linkText("English"));
		Thread.sleep(50000);
		link.click();
		Thread.sleep(50000);
		WebElement searhBox;
		searhBox=driver.findElement(By.id("searchInput"));
		searhBox.sendKeys("Software");
		searhBox.submit();
		Thread.sleep(50000);
		driver.quit();
		
	}
}
