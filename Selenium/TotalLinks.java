package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> Linklist =driver.findElements(By.tagName("a"));																																					
		
		System.out.println("total links: "+Linklist.size());
		
//		for(WebElement e:Linklist) {
//			String linktext=e.getText();
//			System.out.println(linktext);
//			
//	}	
		for(int i=0; i<Linklist.size();i++) {
			String text= Linklist.get(i).getText();
			
			if(!text.isEmpty()) {
				System.out.println(i+ ":"+ text);
				String hrefVal= Linklist.get(i).getAttribute("href");
				System.out.println(hrefVal);
				
			}
			
		}	
		
	}

}
