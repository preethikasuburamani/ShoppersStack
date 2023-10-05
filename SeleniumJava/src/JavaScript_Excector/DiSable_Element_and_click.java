package JavaScript_Excector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiSable_Element_and_click {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = driver;
		
		driver.get("https://www.levi.in/buy-more-save-more?");
		Thread.sleep(5000);
		WebElement addtobag = driver.findElement(By.id("quickviewbutton"));
		js.executeScript("arguments[0].click", addtobag);
		driver.quit();
	}

}
