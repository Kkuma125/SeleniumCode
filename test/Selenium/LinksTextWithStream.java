package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTextWithStream {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		driver.get("https://amazon.in/");
		List<WebElement> Linkslist=driver.findElements(By.tagName("a"));
	//sequence stream:20429
		long stime=System.currentTimeMillis();
//		Linkslist.stream().forEach(ele-> System.out.println(ele.getText()));
		long etime= System.currentTimeMillis();
		System.out.println(etime-stime);
		Linkslist.parallelStream().forEach(ele-> System.out.println(ele.getText()));
		System.out.println(etime-stime);
		
		

	}

}
