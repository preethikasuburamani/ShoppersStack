package Test_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Greggs_coffe_008 {

	@Test
	public void Greggs_coffe()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Reporter.log("Browser is launched",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.greggs.co.uk/");
		
		Reporter.log("Greggs_coffe page is open",true);
		driver.quit();
		Reporter.log("Greggs_coffe page is closed",true);
		
		
		

	}

}
