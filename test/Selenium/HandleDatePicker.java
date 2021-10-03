package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDatePicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
		driver.get("https://www.redbus.in/");
		
		String Year = "2021";
		String Date = "11";
		String Month = "July";
		
		driver.findElement(By.id("onward_cal")).click();
		
		
		while(true) {
			
			String MonthYear = driver.findElement(By.cssSelector(".monthTitle")).getText();
			String arr[] = MonthYear.split(" ");
			String month = arr[0];
			String year = arr[1];
			
			
			if(month.equalsIgnoreCase(Month) && year.equals(Year)) {
				break;
				
			}
			else {
				
				 driver.findElement(By.xpath("//td[@class='next']/button")).click();			}
			
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		
		for(WebElement e :dates) {
			
			String date = e.getText();
			if(date.equals(Date)) {
				e.click();
				
			}
			
		}
		
		
		
	}

}
 