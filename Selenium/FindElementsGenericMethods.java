package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsGenericMethods {
		static WebDriver driver;
	
		public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");

		By links = By.tagName("a");
		By images = By.tagName("img");
		
		int totalimages=getElements(images).size();
		System.out.println(totalimages);
		
		int totallinks=getElements(links).size();
		System.out.println("total no of links: "+ totallinks);
		
	}

		public static List<WebElement> getElements(By Locator) {
			return driver.findElements(Locator);
		
	}
	
	
	
}
