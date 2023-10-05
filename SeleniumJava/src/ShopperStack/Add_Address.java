package ShopperStack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_Address {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		JavascriptExecutor js = driver;
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
		WebElement welcome_dis = driver.findElement(By.xpath("//h3[contains(text(),'Welcome to ShoppersStack')]"));
		System.out.println(welcome_dis.isDisplayed()+" welcome to shoppersStack is displayed");
		driver.findElement(By.id("loginBtn")).click();
		System.out.println(driver.findElement(By.xpath("//button[text()='Shopper Login']")).isDisplayed()+"shopper login is displayed");
		WebElement Email = driver.findElement(By.id("Email"));
		Email.click();
		Email.sendKeys("preethikasubramani02@gmail.com");
		WebElement password = driver.findElement(By.id("Password"));
		password.click();
		password.sendKeys("Preethika@25");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()='P']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		System.out.println(driver.findElement(By.partialLinkText("My Profile")).isDisplayed()+"My profile page is displayed");
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		System.out.println(driver.findElement(By.xpath("//h3[text()='My Address']")).isDisplayed()+"My address page is displayed");
		driver.findElement(By.xpath("//h3[text()='My Address']")).click();
		System.out.println(driver.findElement(By.xpath("//h1[text()='Add Address']")).isDisplayed()+"Add Address page is displayed");
		
	} 

}
