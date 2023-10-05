package Project_Pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class base_class {
	
		//Excepted data
		String ExceptedWelcomePage  ="Demo Web Shop";
		String ExceptedLoginText = "Demo Web Shop. Login";
		String ExceptedHomePage ="Demo Web Shop";
		
		public WebDriver driver;
		//WebDriver driver = new ChromeDriver();
		@BeforeClass
		public void BrowserSetUp() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//URL
			driver.get("https://demowebshop.tricentis.com/");
			String ActualWelcomePage = driver.getTitle();
		   Assert.assertEquals(ActualWelcomePage, ExceptedWelcomePage);
		}
			
			@BeforeMethod
			public void logInToApp() {
			//login to the application
			driver.findElement(By.partialLinkText("Log in")).click();
			String ActualLoginText = driver.getTitle();
			Assert.assertEquals(ActualLoginText, ExceptedLoginText);			
			driver.findElement(By.id("Email")).sendKeys("sumanth.l@testyantra.com");
			String Actual_Email = driver.findElement(By.id("Email")).getAttribute("value");
			Assert.assertEquals(Actual_Email, "sumanth.l@testyantra.com");
			//enter valid password
			driver.findElement(By.id("Password")).sendKeys("WebShop");
			String Actual_Password = driver.findElement(By.id("Password")).getAttribute("value");
			Assert.assertEquals(Actual_Password, "WebShop");
			//click on login button
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			String ActualHomePage = driver.getTitle();
			Assert.assertEquals(ActualHomePage, ExceptedHomePage);
			}
			
			@AfterClass
			public void BrowserTeardown() {
				driver.quit();
			}
			
			@AfterMethod
			public void LogOutToApp() {
				driver.findElement(By.partialLinkText("Log out")).click();
			}
			
}
