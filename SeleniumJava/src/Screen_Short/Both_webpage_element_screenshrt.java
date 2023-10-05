package Screen_Short;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Both_webpage_element_screenshrt {

	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://bingosnacks.com/");
		 //webpage screenshrt
		File webpage = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorshots/img3.png");
		FileHandler.copy(webpage, dest);
		//Element
		WebElement bingo = driver.findElement(By.xpath("//img[@title='Bingo!']"));
		File logo =bingo.getScreenshotAs(OutputType.FILE);
		File dest_logo = new File("./errorshots/img4.png");
		FileHandler.copy(logo, dest_logo);
		driver.quit();
	}

}
