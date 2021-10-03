package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/admin/");
		WebElement username = driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");
		WebElement password = driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.cssSelector("ul#menu li#menu-sale a i")).click();
		driver.findElement(By.xpath("//ul[@id='collapse26']/li[position()=1]")).click();
		String text= driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		System.out.println(text);
		int TotalPages = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		System.out.println("Total Number Of Pages :" + TotalPages);

		for(int i=1 ; i<=11; i++) {
			  WebElement ActivePage = driver.findElement(By.cssSelector("ul.pagination li span"));
			  System.out.println("Active Page :" + ActivePage.getText());
			  ActivePage.click();
			  int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
			  System.out.println("No of rows is :" + rows);
			  
		 for(int r=1 ;r<=rows ;r++) {
			 
			String OrderID=  driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody//tr["+r+"]//td[2]")).getText();
			String Customer = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody//tr["+r+"]//td[3]")).getText();
			String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody//tr["+r+"]//td[4]")).getText();
			
			if(Status.equals("Pending")) {
				System.out.println(OrderID+"     "+Customer+"     "+Status);
			}
			
			
		 }
			  String pageNo = Integer.toString(i+1);
			  driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageNo+"']")).click();
			  
		}
		 
	}

}
