package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroupDownSelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/ ");
		WebElement droupdown = driver.findElement(By.id("cars"));
		Select selectOpt =new Select(droupdown);
		
		System.out.println(selectOpt.isMultiple());		   
		
		//select by index
		selectOpt.selectByIndex(2);
		//select by text
		selectOpt.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		//select by value
		selectOpt.selectByValue("99");
		
		Thread.sleep(5000);
		System.out.println(selectOpt.getFirstSelectedOption());
		List<WebElement> selectedOpt = selectOpt.getAllSelectedOptions();
		for(WebElement LIST:selectedOpt)
		{
			System.out.println(LIST.getText());
		}
		
		driver.quit();
		
		   
	}

}
