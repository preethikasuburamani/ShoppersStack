package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class confirm_Popup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		driver.get("https://licindia.in/branch");
	   WebElement login = driver.findElement(By.partialLinkText("Login"));
	   action.moveToElement(login).perform();
	 
		driver.findElement(By.partialLinkText("Agent Portal")).click();
		 Alert confirm_popup = driver.switchTo().alert();
		 confirm_popup.dismiss();
		driver.quit();
		
	}

}
