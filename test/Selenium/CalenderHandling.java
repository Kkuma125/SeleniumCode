package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling {

	public static WebDriver driver;
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
//		driver.findElement(By.xpath("//a[text()='21']")).click();
	
			
//		selectDate("25");
		By calender = By.cssSelector("table.ui-datepicker-calendar a");
		selectDates("25", calender);
	}
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		
	}
	
	public static void selectDates(String day,By Locator) {
		List<WebElement> date = driver.findElements(Locator);
		System.out.println(date.size());
		
		for(WebElement e : date ) {
			String dates = e.getText();
			 System.out.println(dates);
			 if(dates.equals(day)) {
				 e.click();
				 break;
				}
		 }
	}
	
		 
}
	
