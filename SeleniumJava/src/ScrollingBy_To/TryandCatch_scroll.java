package ScrollingBy_To;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryandCatch_scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor var = driver;
		
		driver.get("https://www.google.com/doodles ");
		for(;;)
		{
			try{
				driver.findElement(By.partialLinkText("Celebrating Pani Puri")).click();
				break;
			}
			catch (Exception e) {
				var.executeScript("window.scrollBy(0,150)");
			}
			
		}
		driver.quit();
		
	}

}
