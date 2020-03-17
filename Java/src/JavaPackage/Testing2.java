package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 {

	public static void main(String[] args) {
//		ChromeOptions options =  new ChromeOptions();
//		options.setHeadless(true);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		
		//Opening a WebPage
		driver.get("https://www.google.com/");
		
		//Maximise the WebPage
		driver.manage().window().maximize();
		
		//Printing Web Page Title
		System.out.println("Title of the Page is "+driver.getTitle());
		//Closing Browser
		//driver.close();
		
	}

}
