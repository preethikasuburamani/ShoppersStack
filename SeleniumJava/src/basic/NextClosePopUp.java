package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextClosePopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.next.co.uk/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("aria-label=\"Close cookies section\"")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("gifts & flowers")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Halloween")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ data-testid='plp-filter-label-button-gender']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Women")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains (@alt,'Pumpkin Spice Fragranced Cat Pillar Candle ')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	
}
}
