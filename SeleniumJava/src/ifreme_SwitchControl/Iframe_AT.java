package ifreme_SwitchControl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_AT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("12345");
		driver.switchTo().parentFrame();
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();	
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='iframe-container']/h5[text()='Nested iFrames']")));
		//driver.switchTo().frame(By.xpath(""));
		//driver.quit();
		
	}

}
