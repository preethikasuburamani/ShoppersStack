package elements_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
	
	public LoginPageElement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	private @FindBy(id  ="Email") WebElement Email;
	
	private @FindBy(id = "Password") WebElement password;
	
	private @FindBy(xpath = "//span[text()='Login']") WebElement LoginButton;
}
