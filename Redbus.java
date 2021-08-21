package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("src")).sendKeys("Chennai All Locations");
		driver.findElement(By.id("dest")).sendKeys("Bengaluru");
		WebElement date=driver.findElement(By.id("onward_cal"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('onward_cal').removeAttribute('readonly','readonly')", date);
		driver.findElement(By.id("onward_cal")).sendKeys("25-Aug-2021");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='search_btn']")).click();
        /*
        String text = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("There are " + text + " are Found");
        driver.findElementByXPath("//label[@for='bt_SLEEPER'][1]").click();
        driver.findElementByXPath("//label[@for='bt_AC' and @class='cbox-label']").click();
        String text2 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
        System.out.println("There are " + text2 + " are Found");*/
	}
}
        
	

		
		//1.Go to https://www.redbus.in/ in chrome
			//2.Type Chennai in From textBox and ENTER
			//3.Type Bengaluru in Destination textBox and ENTER 
			//4.Choose any date in JULY
			//5.Click Search Buses
			//6.Close the popup using the X button at the right corner
			//7.Print the number of search results
			//8.Choose only Sleeper Bus
			//9.Print the number of search results
			//10.Deselect the sleeper Bus and select the AC bus alone
			//11.Print the number of search results
			//12.Choose also Non AC buses
			//13.Print the number of search results
		
		
        
        