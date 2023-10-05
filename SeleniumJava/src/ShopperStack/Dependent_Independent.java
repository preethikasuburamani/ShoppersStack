package ShopperStack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dependent_Independent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("preethikasubramani02@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Preethika@25");
		driver.findElement(By.id("Login")).click();
		
		WebElement category = driver.findElement(By.id("category"));
		Select select_category = new Select(category);
		select_category.selectByIndex(4);
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//span[text()='clothing set']/../..//button[text()='add to cart']")).click();
		driver.findElement(By.id("cartIcon")).click();
		driver.findElement(By.xpath("//h3[text()='gudpig']")).isDisplayed();
	}

}
