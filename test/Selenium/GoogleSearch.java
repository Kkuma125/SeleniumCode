	package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
			
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	
		Thread.sleep(3000);
		By search= By.name("q");
		By suggestion_list = By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']/span");
		
		driver.findElement(search).sendKeys("Dubai Mall");
		Thread.sleep(3000);
		selectFromSuggetionList(suggestion_list, "dubai mall apple store");

	}
	
	public static void selectFromSuggetionList(By suggestion_list, String value)  {
	
		List<WebElement> resultlist =driver.findElements(suggestion_list);
		System.out.println(resultlist.size());
			
		for(WebElement e:resultlist ) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				e.click();
				break;
			}
			
		
		
		
		
	}
	
	
	
	}
}



	
	
	
	
	