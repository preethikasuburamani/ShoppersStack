package Test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



public class Browser_Setup {
		public WebDriver driver;
		
		
		//WebDriver driver = new ChromeDriver();
		@Parameters("Browser")
		@BeforeClass
		public void BrowserSetUp(@Optional("chrome") String Browser) {
			if(Browser.equalsIgnoreCase("Chrome"))
			{
				//Chrome Browser
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if (Browser.equals("firefox")) {
				//Firefox Browser
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (Browser.equals("edge")) {
				//Edge Browser
				System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
			} else {
				System.out.println("Browser is invalid");
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

}
