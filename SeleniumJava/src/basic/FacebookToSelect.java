package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookToSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text() ='Allow all cookies']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Preethika");
		driver.findElement(By.name("lastname")).sendKeys("Subramani");
		WebElement day = driver.findElement(By.id("day"));
		Select DAY = new Select(day);
		DAY.selectByIndex(26);
		
		WebElement month = driver.findElement(By.id("month"));
		Select MONTH = new Select(month);
		MONTH.selectByValue("7");
		//to get all the option of month
		List<WebElement> allOption = MONTH.getOptions();
		for(WebElement monthlist:allOption)
		{
			System.out.println(monthlist.getText());
		}
		
	
		WebElement year = driver.findElement(By.id("year"));
		Select YEAR = new Select(year);
		YEAR.selectByVisibleText("2001");
		//to get all the option of year
		List<WebElement> allyear = YEAR.getOptions();
		for(WebElement yearlist:allyear)
		{
			System.out.println(yearlist.getText());
		}
		
		driver.quit();
		
	}

}
