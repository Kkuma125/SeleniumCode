package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
	
public class FluentWaitConcept {
	static WebDriver driver;
	
	public static void main(String[] args) {
		//WebDriverwait (C)--->imp----> Wait (I)
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By username= By.name("username1");
		By password= By.name("password");
		By Loginbtn= By.xpath("//input[@value='Login']");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class)
									.ignoring(StaleElementReferenceException.class);
								
		wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("vinod");
		
		
			
	}

}
