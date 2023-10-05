package ifreme_SwitchControl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.dream11.com/");
			
			//frame by index
			          //driver.switchTo().frame(0);
			
			//frame by String
			driver.switchTo().frame("send-sms-iframe");
			
			driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("9876543210");
			

		}
}
