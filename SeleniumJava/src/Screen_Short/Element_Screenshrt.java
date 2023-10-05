package Screen_Short;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Element_Screenshrt {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://wildcraft.com/ ");
		WebElement logo = driver.findElement(By.xpath("//img[@title='Wildcraft']"));
		File img = logo.getScreenshotAs(OutputType.FILE);
		File location = new File("errorshots/img2.png");
		FileHandler.copy(img, location);
		driver.quit();
	}
	}


