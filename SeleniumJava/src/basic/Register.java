package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demowebshop.tricentis.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Register")).click();	
	Thread.sleep(2000);
	driver.findElement(By.id("gender-female")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("FirstName")).sendKeys("Preethi");
	Thread.sleep(2000);
	driver.findElement(By.id("LastName")).sendKeys("Subu");
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("preethika02@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys("Sunday@123");
	Thread.sleep(2000);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Sunday@123");
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(2000);
	
	driver.quit();
	
	}
}
