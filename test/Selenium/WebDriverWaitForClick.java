package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForClick {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.dollartree.com/");
		By trackOrders= By.xpath("//span[text()='Track Orders']");
		
		ElementUtil Util = new ElementUtil(driver);
		Util.clickWhenReady(trackOrders, 10);
//		By customers= By.linkText("Customers");
//		
//		WebDriverWait wait= new WebDriverWait(driver,10); 
//		wait.until(ExpectedConditions.elementToBeClickable(trackOrders)).click();
		
		
	}

}
	