package demo.Test;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya.korlam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.newtours.demoaut.com/");
		
		Thread.sleep(5000);
		
		  List <WebElement> links=driver.findElements(By.xpath("//a[@href]"));
		  System.out.println(links.size());
		  
		  for (int i=0; i<links.size(); i++) {
			  
			  WebElement element = links.get(i);
			  String url = element.getAttribute("href");
			  URL link = new URL(url);
			  HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			  Thread.sleep(5000);
			  httpConn.connect();
			  
			  int resCode= httpConn.getResponseCode();
			  if(resCode<400) {
				  System.out.println(url+" Link is valid");
			  }
			  else {
				  System.out.println(url+" Link is not valid");
			  }
		  }
	}
}
