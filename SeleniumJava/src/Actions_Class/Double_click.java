package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training ");
		
		WebElement minus = driver.findElement(By.id("minus"));
		WebElement plus = driver.findElement(By.id("add"));
		Thread.sleep(5000);
		for(int i= 1;i<=3;i++)
		{
		action.doubleClick(plus).perform();
		}
		Thread.sleep(5000);
		for(int i =1;i<=3;i++)
		{
		action.doubleClick(minus).perform();
		}
		
	}

}
