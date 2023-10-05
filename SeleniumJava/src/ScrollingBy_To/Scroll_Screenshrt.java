package ScrollingBy_To;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Screenshrt {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action =new Actions(driver);
		JavascriptExecutor js = driver;
		

		driver.get("https://www.zomato.com/bangalore");
		driver.findElement(By.partialLinkText("Burger")).click();
		
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//h4[text()='Meat And Eat")).click();
				
			} catch (Exception e) {
				
				js.executeScript("window.scrollBy(0,150)");
			}
		}
	//	WebElement logo = driver.findElement(By.xpath("//img[@alt='Zomato"));
		//action.contextClick();
			
			
		}
		
	
	}


