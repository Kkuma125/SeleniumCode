package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelectClass {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
		
			driver= new ChromeDriver();
		
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
			By industry =By.xpath("//select[@id='Form_submitForm_Industry']/option");
			By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
			
			selectDropDownValue(industry, "Electronics");
			selectDropDownValue(country, "United Arab Emirates");
			
		}	
			public static void selectDropDownValue(By Locator ,String value) {
				List<WebElement> optionslist = driver.findElements(Locator);
				
				System.out.println(optionslist.size());
				
				for(WebElement e :optionslist) {
					String text = e.getText();
					System.out.println(text); 
					
				if(text.equals(value)) {
					e.click();
					break;
				}	
				 
				}
				
			}
			
	}


