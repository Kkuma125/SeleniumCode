package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement Drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));
	
		Actions action = new Actions(driver);		
		action.clickAndHold(Drag).moveToElement(Drop).release().build().perform();
		action.dragAndDrop(Drag, Drop).perform();
	 	
		DragAndDrop(Drag, Drop);
						
	}	

	public static void DragAndDrop(WebElement Locator,WebElement List) {
		Actions action = new Actions(driver);
		action.clickAndHold((WebElement) Locator).moveToElement((WebElement) List).release().build().perform();
		
	}	
						
	
	
	
	}			
	 
	