package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Abu Dhabi");
//		////ul[@class='react-autosuggest__suggestions-list']/li
		//input[@class='react-autosuggest__input react-autosuggest__input--open']
//		
		List<WebElement> From=driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
			System.out.println(From.size());
		
			for(WebElement e:From ) {
				String text=e.getText();
				System.out.println(text);
				if (e.getText().contains("Abu Dhabi")){
					e.click();
					Thread.sleep(2000);
					break;
					
			}	 
			
			
	}

	}
	
}