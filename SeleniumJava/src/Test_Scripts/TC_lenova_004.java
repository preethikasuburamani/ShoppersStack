package Test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_lenova_004 {

	@Test
	public void Samsung()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.lenovo.com/");
		
		Reporter.log("lenovo page is open",true);
		driver.quit();
		Reporter.log("lenovo page is closed",true);
		
		
		

	}

}
