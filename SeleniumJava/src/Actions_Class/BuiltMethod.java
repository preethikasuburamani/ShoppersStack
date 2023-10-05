package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuiltMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		WebElement login_button = driver.findElement(By.id("loginBtn"));
		action.click(login_button).build().perform();
		//we can also call only perform with calling build
		
		WebElement Email = driver.findElement(By.id("Email"));
		action.contextClick(Email).perform();
		
		
	}

}
