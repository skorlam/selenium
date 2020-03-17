package demo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Check {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		Thread.sleep(5000);
		//Single Checkbox Demo
		WebElement Checkbox1 =driver.findElement(By.xpath("//div[contains(text(),'Single Checkbox Demo')]/parent::div/div[2]/div[1]/label/input[1]"));
		System.out.println("CheckBox is Displayed "+Checkbox1.isDisplayed());
		Checkbox1.click();
		System.out.println("CheckBox is checked "+Checkbox1.isEnabled());
	}

}
