package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1 : Launch webdriver
		WebDriverManager.chromedriver().setup();
		
		// Step 2 : Launch chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3 : Add FB link
		driver.get("https://en-gb.facebook.com");
		
		// Step 4 : Get title
		String Title = driver.getTitle();
		
		//step 5: Tile
		System.out.println(Title);
		
		//Step 6 : Maximize screen
	    driver.manage().window().maximize();
	    
		//Step 7 : Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Step 8 : Click on create account
		WebElement webuser = driver.findElement(By.linkText("Create New Account"));
		webuser.click();
		
		// Step 9 : Send first name
		driver.findElement(By.name("firstname")).sendKeys("Testleaf");
		
		// Step 10 : Send last name
		driver.findElement(By.name("lastname")).sendKeys("Academy");
		
		// Step 11 : Send mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("leorvhere@gmail.com");
		
		 //Step 12 : create password
		driver.findElement(By.id("password_step_input")).sendKeys("gamble@95");
		
		//Step 13 : Drop down Date
		WebElement Date = driver.findElement(By.id("day"));
		Select Birthdate = new Select(Date);
		Birthdate.selectByIndex(9);
		
		//Step 14 : Drop down Month
		WebElement Birthmonth = driver.findElement(By.name("birthday_month"));
		Select Month = new Select(Birthmonth);
		Month.selectByValue("2");
		
		//Step 15 : Drop Down Year
		WebElement Birthyear = driver.findElement(By.name("birthday_year"));
		Select Year = new Select(Birthyear);
		Year.selectByVisibleText("1995");
		
		//Step 16 : Radio button sex
		driver.findElement(By.name("sex")).click();
		
		//Step 17 : Click Signup
		driver.findElement(By.name("websubmit")).click();
			
	}
}


        /*
        driver.findElement(By.xpath("//div[@id='u_3_a_YS']/following::input")).sendKeys("Testleaf");
        driver.findElement(By.name("lastname")).sendKeys("Academy");
        // driver.findElement(By.id("u_t_d_Lq")).sendKeys("test");
        driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("2345678");
        driver.findElement(By.id("password_step_input")).sendKeys("leaftaps@123");
        WebElement date = driver.findElement(By.name("birthday_day"));
        Select dtdrpDwn = new Select(date);
        dtdrpDwn.selectByValue("12");
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select mnthdrpDwn = new Select(month);
        mnthdrpDwn.selectByVisibleText("Jun");
        */
	
    

		