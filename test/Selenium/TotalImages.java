package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imgList =driver.findElements(By.tagName("img"));
		
		System.out.println("Total list of images: "+ imgList.size());
		
		for(int i=0; i <imgList.size(); i++) {
			String srcUrl= imgList.get(i).getAttribute("src");
			String altUrl= imgList.get(i).getAttribute("alt");
			System.out.println("images: "+srcUrl);
			System.out.println("images: "+altUrl);
			
		}
		

	}

}
