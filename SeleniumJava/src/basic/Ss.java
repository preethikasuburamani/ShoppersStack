package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/products_page/418");
		WebElement pin = driver.findElement(By.id("Check Delivery"));
		pin.sendKeys("635104");
		
		WebElement check = driver.findElement(By.id("Check"));
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(check));
			
		check.click();
		
		pin.clear();
		pin.sendKeys("12345");
		check.click();
		
		driver.quit();
	}

}
