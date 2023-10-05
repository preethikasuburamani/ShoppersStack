package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSelect_Capture {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropdown);
		select.selectByIndex(10);
		
	//	List<WebElement> allitems = select.getAllSelectedOptions();
		List<WebElement> getall = select.getOptions();
		
		for(WebElement list:getall)
		{
			System.out.println(list.getText());
		}
		driver.quit();
	}

}
