package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class KFC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://restaurants.kfc.co.in/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
