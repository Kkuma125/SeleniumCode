package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleDynamicSearch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi'] [@title='Search']")).sendKeys("Java");
		List<WebElement> search = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(search.size());
		
		for(WebElement e : search) {	
		String text = e.getText();
		System.out.println(text);
			if(text.contains("javascript")) {
				e.click();
				break;
			}
				
				
			}
			
		}
		

	}	
 
