package Test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Starbucks_007 {

	@Test
	public void Starbucks()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.starbucks.co.uk/");
		
		Reporter.log("Starbucks page is open",true);
		driver.quit();
		Reporter.log("Starbucks page is closed",true);
		
		
		

	}

}
