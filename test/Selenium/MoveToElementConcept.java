package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(5000);
		WebElement Login= driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		WebElement Member= driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		
		Actions action = new Actions(driver);	
		action.moveToElement(Login).perform();
		Thread.sleep(3000);		
		action.moveToElement(Member).perform();
		
		driver.findElement(By.tagName("a").linkText("Member Login")).click();
		System.out.println("Login Test Case is Passed");
		
		
		
	}

}
