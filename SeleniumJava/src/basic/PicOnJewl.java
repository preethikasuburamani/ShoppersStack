package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PicOnJewl {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Diamond Heart")).click();
		Thread.sleep(3000);
		
		String text=driver.findElement(By.xpath("//strong[text()='Black & White Diamond Heart']")).getText();
		System.out.println(text);
		
		
	}
}
