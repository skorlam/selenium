package JavaPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRBerry {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hrberry.com/smarthr/index.php?q=cms&m=index&client=atmecs");
		
		//Typing UserName
		WebElement element = driver.findElement(By.id("userid"));
		element.sendKeys("796");
		Thread.sleep(5000);
		
		//Type Passowrd
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("AbCD@1234");
		
		//Submit button
		element.submit();
		Thread.sleep(10000);
		driver.findElement(By.className("small logout_caption"));

				
	}

	
}
