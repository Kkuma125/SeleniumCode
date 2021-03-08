package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWaitExample {

	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By username= By.name("username");
		By password= By.name("password");
		By Loginbtn= By.xpath("//input[@value='Login']");
		
		
		ElementUtil util= new ElementUtil(driver);
		util.retryingElement(username).sendKeys("batchautomation");
		util.doSendKeys(password, "Test@12345");
		util.doClick(Loginbtn);
		
		
	}

}
