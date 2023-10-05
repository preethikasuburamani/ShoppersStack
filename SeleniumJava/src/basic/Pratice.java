package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//label[text()='Excellent']")).click();
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		WebElement text = driver.findElement(By.xpath("//div[text()='Only registered users can vote.']"));
		System.out.println(text.getText());
		driver.quit();
	}
}
