package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class meshooD_IDxpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/search?q=watches ");
		Thread.sleep(3000);
		String D_ID = driver.findElement(By.xpath("//p[text()='Fashionate Sports Watches']/..//h5")).getText();
		System.out.println(D_ID);
		Thread.sleep(3000);
		driver.quit();
	}

}
