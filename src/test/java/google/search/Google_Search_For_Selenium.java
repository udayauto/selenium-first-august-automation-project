package google.search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Search_For_Selenium {

	public static void main(String[] args) {

		// Launch Chrome browser.
		WebDriverManager.chromedriver().setup(); // Call Driver
		WebDriver driver = new ChromeDriver();

		//Sync
	  //	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step1: Open Google application.
		driver.get("https://google.com/");

		// Step2: Enter ‘Selenium' into search box - Xpath
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("SELENIUM");

		// Step3: Click on the Search button.
		driver.findElement(By.xpath("//*[@name='btnK']")).click();

	}

}
