package google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickonGmailLink {
	
	public static void main(String[] args) {

		
		// Launch Chrome browser.
		 WebDriverManager.chromedriver().setup();     //Call Driver
		 WebDriver driver = new ChromeDriver();
		 
		//Step1: Open Google application.
		 driver.get("https://google.com/");
		 
		 //Step2: Click on Gmail - LInk.
		// driver.findElement(By.linkText("Gmail")).click();
		 driver.findElement(By.partialLinkText("Gma")).click();
		
		 //Lenth
		 //Dynamic
	}
	

}
