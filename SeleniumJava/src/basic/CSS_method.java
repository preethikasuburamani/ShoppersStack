package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_method {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(2000);
		
		WebElement error = driver.findElement(By.xpath("//span[contains (text(),' invalid')]"));
		Thread.sleep(2000);
		
		System.out.println(error.getCssValue("color"));
		System.out.println(error.getCssValue("font-size"));
		
		driver.quit();
		
	}

}
