package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 
	}

	public static WebDriver getUrl(String Locator) {
		
		driver.get("https://www.google.co.in");
		return driver;
		
		
	}
	
	
}
