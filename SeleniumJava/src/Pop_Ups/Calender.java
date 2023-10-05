package Pop_Ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) {

		LocalDateTime date = LocalDateTime.now().plusDays(1).minusMonths(1);
		
				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions setting= new ChromeOptions();
		setting.addArguments("-disable_notifications");
		
		ChromeDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://in.via.com/");
		driver.findElement(By.id("departure")).click();
		
		for(;;)
		{
			try {
		driver.findElement(By.xpath("//span[contains(text(),'Aug')]/../..//span[text()=' 2023']/../..//div[text()='24']")).click();
			}
			catch (Exception e) {
				driver.findElement(By.xpath("//span[contains(@class,'js-next-month')]")).click();
			}
			
		
			}

	}}
