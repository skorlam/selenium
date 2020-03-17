package demo.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flatlogic.github.io/awesome-bootstrap-checkbox/demo/");
		Thread.sleep(5000);
		//Single Checkbox Demo
		WebElement Checkbox1= driver.findElement(By.id("checkbox1"));
		Checkbox1.click();
		System.out.println("Checkbox is Selected "+Checkbox1.isSelected());
		System.out.println("Checkbox is Enabled "+Checkbox1.isEnabled());
		
		//CheckRadio Button
		WebElement radio= driver.findElement(By.name("radio1"));
		Thread.sleep(5000);
		radio.click();
		
		Thread.sleep(5000);
		System.out.println("Radio is Selected "+radio.isSelected());
		System.out.println("Radio is Enabled "+radio.isEnabled());
		driver.close();
	}

}
