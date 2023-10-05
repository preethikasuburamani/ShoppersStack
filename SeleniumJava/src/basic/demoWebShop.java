package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoWebShop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	
	
	driver.get("https://demowebshop.tricentis.com/"); 
	Thread.sleep(2000);
	WebElement message = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
	Thread.sleep(2000);
	System.out.println(message.getCssValue("color"));
	System.out.println(message.getAttribute("alt"));
	
	
	driver.findElement(By.id("small-searchterms")).sendKeys("jewelry",Keys.ENTER);
	
	driver.findElement(By.partialLinkText("Register")).click();
	WebElement radioButton = driver.findElement(By.id("gender-female"));
	System.out.println(radioButton.isSelected());
	radioButton.click();
	System.out.println(radioButton.isSelected());
	if(radioButton.isSelected())
	{
		System.out.println("radio button is selected");
	}
	else
	{
		System.out.println("radio button is not selected");
	}
	//driver.quit();
	
	
}
}
