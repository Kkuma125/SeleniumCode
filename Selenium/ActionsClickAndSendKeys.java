package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;
	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		By Firstname= By.id("input-firstname");
		By Lastname= By.id("input-lastname");
		By LoginBtn= By.linkText("Login");
				
//		Actions action= new Actions(driver);
//		action.sendKeys(driver.findElement(Firstname), "Vinod").perform();
//		action.sendKeys(driver.findElement(Lastname), "Kumar K").perform();
//		action.click(driver.findElement(LoginBtn)).click().perform();
		doActionsSendKeys(Firstname, "Vinod");
		doActionsSendKeys(Lastname, "Kumar K");
		doActionsClick(LoginBtn);
		
		
		
		}
		public static WebElement getElement(By Locator) {
			return driver.findElement(Locator);
		}	
		
		public static void doActionsClick(By Locator) {
			Actions action= new Actions(driver);
			action.click(getElement(Locator)).perform();
		}
		
		public static void doActionsSendKeys(By Locator,String value) {
			Actions action= new Actions(driver);
			action.sendKeys(getElement(Locator), value).perform(); 
		}
		
}


