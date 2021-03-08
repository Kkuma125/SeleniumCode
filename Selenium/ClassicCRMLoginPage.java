package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassicCRMLoginPage {

	public static void main(String[] args) {

		By username =By.className("username");
		By password =By.className("password");
		By LoginButton =By.xpath("//input[@type='submit']");
		
		DriverFactory df= new DriverFactory();
		WebDriver driver =df.Intilization("chrome");
		
		df.launchUrl("https://classic.crmpro.com/");
		
		ElementUtil util= new ElementUtil(driver);
		util.doSendKeys(username, "vinod@1234");
		util.doSendKeys(password, "Kkuma125");
		util.doClick(LoginButton);
		
		df.closeBrowser();
		
	}
	
}
