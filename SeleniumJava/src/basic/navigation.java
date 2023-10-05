package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.get("https://www.shoppersstack.com/");
		driver.navigate().to("https://www.shoppersstack.com/");
		
		driver.navigate().back();  //give the demowebshop 
		Thread.sleep(5000);
		driver.navigate().forward();  // give the ShoppersStack
		Thread.sleep(5000);
		
		driver.findElement(By.id("loginBtn"));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
