package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectAllOptions {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		Select select =new Select(driver.findElement(industry));
		List<WebElement> induslist= select.getOptions();
		System.out.println(induslist.size());				
		
		for(WebElement e:induslist ) {
			System.out.println(e.getText());
			
			if(e.getText().equals("Travel")) {
				e.click();
				break;
			}
			
		}
		
		List<String> list=getOptionsTextList(country);
		
		System.out.println(list);
		
	}		
	
	
	
	public static List<String> getOptionsTextList(By Locator) {
		
		List<String> optionstextlist= new ArrayList<>();
		Select select =new Select(driver.findElement(Locator));
		List<WebElement> OptionsList = select.getOptions();
		
		
		for(WebElement e:OptionsList ) {
			String text=e.getText();
			System.out.println(text);
			optionstextlist.add(text);
			
	}
		return optionstextlist;
	
	}


	}	
		
	
