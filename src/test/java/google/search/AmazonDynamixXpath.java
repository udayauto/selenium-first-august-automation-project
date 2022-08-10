package google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDynamixXpath {
	
	public static void main(String[] args) {
		// Launch Chrome browser.
		 WebDriverManager.chromedriver().setup();     //Call Driver
		 WebDriver driver = new ChromeDriver();
		 
		//Step1: Open Google application.
		 driver.get("https://www.amazon.com/");
		
		//Step2: eneter keyword insto search box - Laptops.
	//	 driver.findElement(By.xpath("//*[@class='nav-input nav-progressive-attribute' and @name='field-keywords' ]")).sendKeys("Laptops");
		 
		 //Step3: CLick on Amazon Logo- Xpath using --- OR
		 driver.findElement(By.xpath("//*[@id='nav-logo-sprites' or aria-label='Amazon']")).click();
		

		
		
		
		
		
		
		
	}
}
