package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BR {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("SHOP")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
