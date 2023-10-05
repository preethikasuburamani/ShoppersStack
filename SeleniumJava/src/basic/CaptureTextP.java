package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTextP {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kwickremoval.co.uk/ ");
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Contact us")).click();
	Thread.sleep(3000);
	String text=driver.findElement(By.xpath("//span[contains (text(),' please contact')]")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	driver.quit();
	
}
}
