package ScrollingBy_To;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy_TO {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor var = driver;
	
		driver.get("https://wildcraft.com/");
		var.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		var.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		var.executeScript("window.scrollTo(0,600)");
		Thread.sleep(5000);
		driver.quit();
	}
}