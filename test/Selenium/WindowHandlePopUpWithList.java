package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlePopUpWithList {

		public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		Set<String> Handles = driver.getWindowHandles();
		
		List<String> HandlesList = new ArrayList<String>(Handles);
		String ParentID = HandlesList.get(0);
		String ChildID = HandlesList.get(1);
		driver.switchTo().window(ChildID);
		System.out.println("child window title is :" + driver.getTitle());
		driver.close();	
		driver.switchTo().window(ParentID);
		System.out.println("parent window title is :" + driver.getTitle());
		driver.findElement(By.name("txtUsername"));
		driver.findElement(By.name("txtPassword"));
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
