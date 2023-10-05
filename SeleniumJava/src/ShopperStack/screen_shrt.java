package ShopperStack;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screen_shrt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		JavascriptExecutor js = driver;
		
		driver.get("https://www.shoppersstack.com/");
		WebElement home_logo = driver.findElement(By.id("home"));
		File home =home_logo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/logo.png");
		
		

	}

}
