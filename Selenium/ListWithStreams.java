package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
	
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry =By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		List<WebElement> industlist=driver.findElements(industry);
		System.out.println(industlist);
			
		long stime=System.currentTimeMillis();
		//1.sequence stream:943 sec.
//		industlist.stream().forEach(ele-> System.out.println(ele.getText()));
		
		long etime= System.currentTimeMillis();
			System.out.println(etime-stime);
		
		//2.parllel stream:
			industlist.parallelStream().forEach(ele-> System.out.println(ele.getText()));
			
		
		

	}

}
