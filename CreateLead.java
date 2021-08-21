package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText ("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF ACADEMY");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ravichandran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balaraj");
		WebElement Source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select get=new Select(Source);
		get.selectByVisibleText("Website");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("chandran");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Electronics");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("11,000.00");
		driver.findElement(By.name("numberEmployees")).sendKeys("87");
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select industryget=new Select(industry);
		industryget.selectByVisibleText("Computer Software");
		WebElement sole=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select soleget=new Select(sole);
		soleget.selectByVisibleText("Corporation");
		driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys(Keys.BACK_SPACE);
		WebElement rupee=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select rupeeget=new Select(rupee);
		rupeeget.selectByVisibleText("INR - Indian Rupee");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//driver.close();
		
	}
	
	
	
	}
