package JavaPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		WebElement element = driver.findElement(By.id("identifierId"));
		element.sendKeys("satya.korlam@atmecs.com");
		Thread.sleep(10000);
		
		//element.submit();
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(10000);
		
		WebElement element1 = driver.findElement(By.name("password"));
		element1.sendKeys("MoLU@28112015");
		Thread.sleep(10000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(10000);
		

		

		
		
			}
}
