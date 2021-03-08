package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private WebDriver driver;
	
	/**
	 * This method is used to initilizing the driver on the basis of given browsername
	 * @param BrowserName
	 * @return this return WebDriver Driver
	 */
	
	public  WebDriver Intilization(String BrowserName) {
		
		System.out.println("Broswer name is: "+ BrowserName);
		
		if (BrowserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			
		}
		else if (BrowserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
	 		driver= new FirefoxDriver();
		
		}

		else {
			System.out.println("Please pass correct browser name=====: "+ BrowserName);
			
			
		}
	
		return driver;
		}
		
		public void launchUrl(String url) {
			driver.get(url);
				
		}
	
		public String doGetPageTitle() {
			return driver.getTitle();
				
		}
		public String doGetPageUrl() {
			return driver.getCurrentUrl();
		}
		
		public void closeBrowser() {
			driver.close();
		}
		public void quitBrowser() {
			driver.quit();
			
			
			
			
			
				
	 }		
			
}
