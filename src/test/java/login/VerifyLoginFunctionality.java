package login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class VerifyLoginFunctionality {
	 public static void main(String[] args) {
		// Launch Chrome browser.
	
		 WebDriverManager.chromedriver().setup();     //Call Driver
		 WebDriver uday = new ChromeDriver();
		 
		 //Step1: Open firefox - Amazon
		 uday.get("https://www.amazon.com/");
		 
		 //Step2: Close browser.
		// uday.close();
		 
	}


}
