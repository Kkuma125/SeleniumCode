package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		By righClick=By.xpath("//span[text()='right click me']");
		
//		WebElement righClick=driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions action= new Actions(driver);
//		action.contextClick(righClick).perform();
		By Right= By.xpath("//ul/li[contains(@class,'context-menu-icon')]");	
		
		List<String> Click= getRightClickList(righClick,Right);
		System.out.println(Click.size());
		System.out.println(Click);
		
		ClickOption(righClick,Right, "Delete");
	}
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static List<String> getRightClickList(By Locator, By List) {
		
		Actions action= new Actions(driver);
		action.contextClick(getElement(Locator)).perform();
		List<String> Menu= new ArrayList<String>();
		List<WebElement> rightMenu =driver.findElements(Locator);
		System.out.println(rightMenu.size());
		
		for(WebElement e: rightMenu) {
			String text=e.getText();
			Menu.add(text);	
			
		}
			return Menu;
		
	} 
	
	
	
	
	public static void ClickOption(By Locator,By List,String value) {
		Actions action= new Actions(driver);
		action.contextClick(getElement(Locator)).perform();
		List<WebElement> rightMenu =driver.findElements(Locator);
		System.out.println(rightMenu.size());
		
		for(WebElement e: rightMenu) {
			String text=e.getText();
			if(text.equals(value)) {
				e.click();
				break;	
			}
			
		}
			
		
	} 
	
	
}	
