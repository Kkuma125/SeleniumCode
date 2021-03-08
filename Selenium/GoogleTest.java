package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		////div[@id='react-autowhatever-1']/div/ul/li
		driver.findElement(By.id("fromCity")).sendKeys("Dubai");
		List<WebElement> Make=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='calc60']"));
		System.out.println(Make.size());
		//ul[@role='listbox']//li/descendant::div[@class='calc60']
		//div[@id='react-autowhatever-1']/div/ul/li
		for(WebElement e:Make) {
			String text=e.getText();
			System.out.println(text);

			
		if(text.equals("Dubai, United Arab Emirates"));	
			e.click();
			break;
		}	
			
		

	}

}	
	