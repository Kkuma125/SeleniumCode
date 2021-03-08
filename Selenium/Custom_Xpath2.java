package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath2 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		
		
		//a[contains(@href,'login') and text()='Forgot Password?']
		//a[contains(@href,'login') and contains(text(),'Forgot Password?')]
		
		//starts with:
		//input[starts-with(@name,'username')]
		//(//div[@class='input-group']/input)[1]
		
		
		//(//div[@class='navFooterLinkCol navAccessibility'])[position()=1]//a
		
		//parent and child:
		//(//div[@class='navFooterLinkCol navAccessibility'])[position()=2]//a
		//direct child :/
		//all child://
		
		//(//form[@id='hs-login']/button)[1]
		//form[@id='hs-login']//input
		//parent to child:
		//div[@class='input-group']//child::input
		//child to parent:reverse travarsing
		
		//input[@name='username']/../../../../../../..
		//backward traversing in xpath:
		//input[@name='username']//parent::div
		//input[@name='username']//parent::div/..
		//input[@name='username']//parent::div//parent::form
		//input[@name='username']//ancestor::form	
		//preceding-sibling:
		//a[text()='Vinod Kamara']//parent::td//preceding-sibling::td/input
		//a[text()='Vinod Kamara']//parent::td//following-sibling::td/a[6]
		//a[text()='Vinod Kamara']//parent::td//following-sibling::td/a[@context='company'][1]
		

	}

}
