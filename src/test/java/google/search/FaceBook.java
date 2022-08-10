package google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {

		// Launch Chrome browser.
		WebDriverManager.chromedriver().setup(); // Call Driver
		WebDriver driver = new ChromeDriver();

		// Step1: Open Google application.
		driver.get("https://www.facebook.com/");

		// Step2: CLick on Create New account button.
		// driver.findElement(By.id("u_0_0_bY")).click();
		//driver.findElement(By.xpath("//a[starts-with(@id, 'u_0_0_')]")).click();

		//contains
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0_')]")).click();
		
		
		
	}

}
