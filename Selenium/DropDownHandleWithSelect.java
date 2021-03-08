package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {
	static WebDriver driver;
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 
//		 WebElement industry =driver.findElement(By.id("Form_submitForm_Industry"));
//		 WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
//		 
//		 Select select= new Select(industry);
//		 select.selectByIndex(5);
//		 select.selectByValue("Automotive");
//		 select.selectByVisibleText("Aerospace");
//		 
//		 Select select2 = new Select (country);
//		 select2.selectByVisibleText("United Arab Emirates");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country"); 
		 
		doSelectDropDownByVisibleText(country, "United Arab Emirates");
		doSelectDropDownByIndex(industry, 6);
		
		}
	
		public static WebElement getElement(By Locator) {
			return driver.findElement(Locator);
			
		}

		public static void doSelectDropDownByVisibleText(By Locator ,String value) {
			Select select = new Select(getElement(Locator));
			select.selectByVisibleText(value);
		}
	
		public static void doSelectDropDownByIndex(By Locator ,int index) {
			Select select = new Select(getElement(Locator));
			select.selectByIndex(index);
						
		}
		public static void doSelectDropDownByValue(By Locator ,String value) {
			Select select = new Select(getElement(Locator));
			select.selectByValue(value);
				
		}
	}	
