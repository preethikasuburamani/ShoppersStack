package ScrollingBy_To;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Argument;

public class Scroll_into_view_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action =new Actions(driver);
		JavascriptExecutor js = driver;
		
		driver.get("https://polarbear.co.in/");
		//WebElement imag = driver.findElement(By.linkText("Connect with us"));
		WebElement img = driver.findElement(By.id("sbi_18064600978340492"));
		js.executeScript("arguments[0].scrollIntoView(true)", img);

	}

}
