package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScoreCard {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/bangabandhu-t20-cup-2020-21-1239302/gazi-group-chattogram-vs-minister-rajshahi-19th-match-1239579/full-scorecard");
		
//		String wicket=driver.findElement
//		(By.xpath("//a[text()='Soumya Sarkar']//parent::td//following-sibling::td/span")).getText();
//		System.out.println(wicket);
		
//		System.out.println(getWicketTakerName("Mohammad Mithun"));
		
		System.out.println(getScoreList("Arafat Sunny"));
		
	}

	public static String getWicketTakerName(String Playername) {
		return driver.findElement(By.xpath("//a[text()='"+Playername+"']//parent::td//following-sibling::td/span")).getText();
	}
	
	public static List<String> getScoreList(String Playername) {
		System.out.println("getting score card for: "+Playername);
		List<String> scorecard = new ArrayList<String>();
		List<WebElement>list =driver.findElements(By.xpath("//a[text()='"+Playername+"']//parent::td//following-sibling::td"));
		System.out.println(list.size());
		
		for(int i=1;i<list.size();i++) {
			String text = list.get(i).getText();
			if(!text.isBlank()) {
				scorecard.add(text);
			
				 
			} 
			
		}
			return scorecard;
	}
}
