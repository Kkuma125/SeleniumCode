package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By Choicelist= By.xpath("//span[@class='comboTreeItemTitle']");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
//		selectChoiceFromDropDown(Choicelist, "choice 1");
//		selectChoiceFromDropDown(Choicelist, "choice 2","choice 6","choice 6 2","choice 7");
		selectChoiceFromDropDown(Choicelist, "All");
		Thread.sleep(5000);
		driver.findElement(By.id("justAnInputBox1")).click();
		By choice =By.xpath("//span[@class='comboTreeItemTitle']");
		selectChoiceFromDropDown(choice, "choice 2");
		
	}
	
	/**
	 * Passthe single value for single selection
	 * Pass the multiple String vaules for multiple section	
	 * Pass "All" for all selection values from dropdown
	 * @param Choicelist
	 * @param value
	 */
	public static void selectChoiceFromDropDown(By Choicelist,String...value) {
		
		List<WebElement> ChoiceList= driver.findElements(Choicelist);
		if(!value[0].equalsIgnoreCase("All")) {
			
		for(int i=0;i<ChoiceList.size();i++) {
			String text=ChoiceList.get(i).getText();
			System.out.println(text);
			
				for(int j=0;j<value.length;j++) {
					if(text.equals(value[j])) {
						ChoiceList.get(i).click();
						break;
					}
				}
			
			}
		
		}
	
		//select all values
		else {
			try {
			for(WebElement e: ChoiceList) {
				e.click();
			}
			
			}
			catch(Exception e){
					
			}
		}	
	}
}
