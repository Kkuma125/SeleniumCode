package Selenium;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GraphHandle {

	static WebDriver driver ;

	public static void main(String[] args) throws ParseException {


		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.google.com/search?q=covid+cases+in+india&sxsrf=AOaemvLCGRDl9nhX1ljuOy2RBZZ-36yGFg%3A1633245852363&source=hp&ei=nFpZYeSXFMbf1sQP1paIqAI&iflsig=ALs-wAMAAAAAYVlorDo40gv2nlEkOdg-1S4BXoB5vnaQ&oq=covid+cases+in+india&gs_lcp=Cgdnd3Mtd2l6EAMYADIECCMQJzIICAAQgAQQsQMyCwgAEIAEELEDEMkDMgUIABCSAzIFCAAQkgMyBQgAEIAEMggIABCABBCxAzIHCAAQsQMQQzILCAAQgAQQsQMQgwEyCAgAEIAEELEDOgQIABBDOgoIABCxAxCDARBDOggIABCxAxCDAVCcBVjFCmC_E2gAcAB4AIAB9wGIAeEGkgEFMC40LjGYAQCgAQE&sclient=gws-wiz");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("(//*[local-name()='svg' and @class='uch-psvg'])[2]"));
		int getTopLeftY = ((ele.getSize().getHeight())/2) -ele.getSize().getHeight();
		int getTopLeftX = ((ele.getSize().getWidth())/2) -ele.getSize().getWidth();

		Actions act = new Actions(driver);

		String start_Date = "20-03-2020";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		Date d1 = sdf.parse(start_Date);
		Date d2 = new Date();
		long diffdays = TimeUnit.MILLISECONDS.toDays(d2.getTime() - d1.getTime());

		for (int i =0; i < diffdays;i++) {
			act.moveToElement(ele, getTopLeftX+i, getTopLeftY).perform();
			String Data	=driver.findElement(By.xpath("//table[@class='swWWne']/tbody")).getText();
			System.out.println(Data);

		} 

	}

}
