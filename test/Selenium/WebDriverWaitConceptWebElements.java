package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptWebElements {
	static WebDriver driver;
		
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footerLinks= By.cssSelector("ul.footer-nav li a");
//		By username=By.name("username");
//		By password= By.name("password");
//		By loginbtn= By.xpath("//input[@value='Login']");
//		
//		waitForElementPresent(username, 10).sendKeys("batchautomation");
//		driver.findElement(password).sendKeys("Testing@12345");
//		driver.findElement(loginbtn).click();
		
		
		List<WebElement> footer=waitForVisiblityOfAllElement(footerLinks, 10);
		System.out.println(footer.size());
		footer.stream().forEach(ele-> System.out.println(ele.getText()));
	}
	
	public static  WebElement getElement(By Locator) {
		return driver.findElement(Locator);
		
	}
	public static WebElement waitForElementPresent(By Locator ,int TimeOut) {
		WebDriverWait wait= new WebDriverWait(driver,TimeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		
	}
	/**
	 * An expectation for checking that an element, known to be present on the
	 *  DOM of a page, isvisible. Visibility means that the element is not only displayed but also has a height andwidth that is greater than 0.
	 * @param Locator
	 * @param TimeOut
	 * @return
	 */
	public static WebElement waitForElementVisible(By Locator ,int TimeOut) {
		WebDriverWait wait= new WebDriverWait(driver,TimeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(Locator)));
	}
	public static List<WebElement> waitForVisiblityOfAllElement(By Locator ,int TimeOut) {
		WebDriverWait wait= new WebDriverWait(driver,TimeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Locator));
			
	}
	
	
	}