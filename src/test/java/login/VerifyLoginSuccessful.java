package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginSuccessful {
	
	public static void main(String[] args) {
		
		// Launch Chrome browser.
		 WebDriverManager.chromedriver().setup();     //Call Driver
		 WebDriver driver = new ChromeDriver();
		 
		 //Step1: Open HRM application
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 
		//Step2: Enter UserName and Password
		 driver.findElement(By.name("txtUsername")).sendKeys("admin");
		//Step3: Enter Password.
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//Step3: Submit. 
		 driver.findElement(By.className("button")).click();
	}

}
