package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Notification_popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Syntax for notification popup by Chrome options
				ChromeOptions setting= new ChromeOptions();
				setting.addArguments("-disable-notifications");
		//need to pass this variable of chrome option in chrome driver		
		ChromeDriver driver = new ChromeDriver(setting);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		
		driver.get("https://www.kalkifashion.com/");
	}

}
