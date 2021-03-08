package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> Handles = driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();
		String ParentWindowID = it.next();
		System.out.println("this is Parent :" + ParentWindowID);
		String childWinodowID = it.next();
		System.out.println("this is Child :" + ParentWindowID);
		driver.switchTo().window(childWinodowID);
		System.out.println("child window title is :" + driver.getTitle());
		driver.close();	
		driver.switchTo().window(ParentWindowID);
		System.out.println("parent window title is :" + driver.getTitle());
		driver.quit();
		
		 
		

	}

}
