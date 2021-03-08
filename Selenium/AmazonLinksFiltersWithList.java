package Selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinksFiltersWithList {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://amazon.in/");
		List<WebElement> Linkslist=driver.findElements(By.tagName("a"));
		
		List<String> Link =Linkslist
						.stream()
						.filter(ele-> !ele.getText().isEmpty())
						.filter(ele-> ele.getText().contains("Amazon"))
						.map(ele-> ele.getText().trim())
						.collect(Collectors.toList());
		
		Link.stream().forEach(ele-> System.out.println(ele));			
						
						


		
		
		
		
		
		
	}

}
