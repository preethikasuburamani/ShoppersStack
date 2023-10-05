package Test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_costa_006 {

	@Test
	public void costa()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.costa.co.uk/");
		
		Reporter.log("costacostahttps://www.starbucks.co.uk/ page is open",true);
		driver.quit();
		Reporter.log("costa page is closed",true);
		
		
		

	}

}
