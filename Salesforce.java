package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL 
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Academy");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("Testleaf.academy@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TechMahindra");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("04272441741");
		// Step 7: Handle all the dropdowns
		WebElement job=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select jobget=new Select(job);
		jobget.selectByVisibleText("Others");
		WebElement sole=driver.findElement(By.name("CompanyEmployees"));
		Select soleget=new Select(sole);
		soleget.selectByVisibleText("15 - 100 employees");
		WebElement county=driver.findElement(By.name("CompanyCountry"));
		Select countyget=new Select(county);
		countyget.selectByVisibleText("Russia");
		// Step 8: Click the check box
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		// Step 9: Close the browser
		driver.close();
		//*Note: No need click Start my freeTrial

	}

}
