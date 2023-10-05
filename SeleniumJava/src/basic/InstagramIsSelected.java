package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//button[text() ='Allow all cookies']")).click();
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(login.isEnabled());
		

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("preethika");
		

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Sunday@123");
		

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(login.isEnabled());
		driver.quit();
		


	}

}
