package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class pret {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver.", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.pret.co.uk/en-GB");
		Thread.sleep(2000);
		driver.quit();
	}
}
