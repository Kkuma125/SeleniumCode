package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		
		String browserName="chrome";
		
		By Domain= By.id("Form_submitForm_subdomain");
		By First_Name= By.id("Form_submitForm_FirstName");
		By Last_Name=By.id("Form_submitForm_LastName");
		By SubmitButtom= By.id("Form_submitForm_action_request");
		
		DriverFactory df = new DriverFactory();
		WebDriver driver =df.Intilization(browserName);
		df.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String title= df.doGetPageTitle();
		System.out.println("page title is: "+title);
		
		if(title.contains("Human Resource")) {
			System.out.println("Correct Page");
			
		}	
		
		ElementUtil Util= new ElementUtil(driver);
		Util.doSendKeys(Domain, "VinodAutomationLabs");
		Util.doSendKeys(First_Name, "Vinod");
		Util.doSendKeys(Last_Name, "Kumar");
		Util.doClick(SubmitButtom);
		
		
	}

}
