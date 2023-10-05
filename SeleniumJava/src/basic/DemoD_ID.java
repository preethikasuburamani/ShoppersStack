package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoD_ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Thread.sleep(3000);
		WebElement AddToCart = driver.findElement(By.xpath("//a[text()='$100 Physical Gift Card']/../..//input[@type='button']"));
		AddToCart.click();		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[@itemprop=\"price\"]")).getText());
	
		driver.quit();
		

	}

}
