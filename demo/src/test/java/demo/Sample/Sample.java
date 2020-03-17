package demo.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1583840784&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3d78af719d-304f-e4c9-0cf4-80291d870bfe&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("loginfmt"));
		username.sendKeys("skorlam@outlook.com");
		
		WebElement uNext = driver.findElement(By.xpath("/html//input[@id='idSIButton9']"));
		uNext.click();
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("Molu@2811");
		
		Thread.sleep(3000);
		
		WebElement logIn = driver.findElement(By.xpath("/html//input[@id='idSIButton9']"));
		logIn.click();
		
		Thread.sleep(10000);
		
		WebElement logOff = driver.findElement(By.id("O365_HeaderRightRegion"));
		logOff.click();
		
		WebElement logOffClick = driver.findElement(By.linkText("Sign out"));
		logOffClick.click();
		
		
		driver.close();
		
		
	}

}
