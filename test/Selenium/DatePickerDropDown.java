package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		 
		Select month = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Nov");
		
		Select Year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		Year.selectByVisibleText("2022");

		String Date = "15";
		
		List<WebElement> AllDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement e : AllDates) {
			String dates = e.getText();
			
			if(dates.equals(Date)) {
				e.click();
				break;
			}
			
		}
		driver.close();
		
	}

}
