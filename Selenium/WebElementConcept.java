package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String Title=driver.getTitle();
		System.out.println("Correct Page Title: "+ Title);
		
//		if(Title.equals("Title")){
//			System.out.println("Correct");
//			
//			
//		else {
//			
//		}	System.out.println("Incorrect");	
//		
		
		By Domain= By.id("Form_submitForm_subdomain");
		By First_Name= By.id("Form_submitForm_FirstName");
		By Last_Name=By.id("Form_submitForm_LastName");
		By SubmitButtom= By.id("Form_submitForm_action_request");
		
//		getElement(Domain).sendKeys("VinodAutomationLabs");
//		getElement(First_Name).sendKeys("Vinod");
//		getElement(Last_Name).sendKeys("Kumar");
//		getElement(SubmitButtom).click();
		
//		doSendKeys(Domain, "VinodAutomationLabs");
//		doSendKeys(First_Name, "Vinod");
//		doSendKeys(Last_Name, "Kumar");
//		doClick(SubmitButtom);
		
		
	}
		
	
	
	
}
