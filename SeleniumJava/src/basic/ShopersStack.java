package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShopersStack {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.id("loginBtn"));
		login.click();
		driver.findElement(By.id("Email")).sendKeys("preethikasubramani02@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Preethika@25");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.partialLinkText("Home")).isDisplayed());
		driver.findElement(By.xpath("//div[text() ='P']")).click();
		driver.findElement(By.xpath("//li[@role='menuitem'][1]")).click();
	
	}
}
