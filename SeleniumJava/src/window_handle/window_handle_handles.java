package window_handle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window_handle_handles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action =new Actions(driver);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
		
		//get one window ID
		System.out.println(driver.getWindowHandle());
		
		
		
		//get all the window ID
		Set<String> allwindow = driver.getWindowHandles();
		for(String windows:allwindow)
		{
			driver.switchTo().window(windows);
			System.out.println(windows);
			
			if(driver.getTitle().contains("Time"))
			{
				driver.findElement(By.partialLinkText("Try Free")).click();
			}
		}
	}

}
