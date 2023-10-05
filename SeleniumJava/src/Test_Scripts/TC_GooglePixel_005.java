package Test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_GooglePixel_005 {

	@Test
	public void GooglePixel()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://store.google.com/");
		
		Reporter.log("GooglePixel page is open",true);
		driver.quit();
		Reporter.log("GooglePixel page is closed",true);
		
		
		

	}

}
