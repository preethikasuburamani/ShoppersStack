package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
	
		String error =driver.findElement(By.xpath("//span[contains(text(),\"error\")]")).getText();
		System.out.println(error);
		driver.quit();
	}

}
