package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.id("username"));
	Thread.sleep(2000);
	
	
	username.clear();
	username.sendKeys("Preethika");
	Thread.sleep(2000);
	
	
	WebElement password= driver.findElement(By.id("password"));
	Thread.sleep(2000);
	
	
	password.clear();
	password.sendKeys("Sunday@123");
	
	driver.quit();
	
                                     
}
}
