package elements_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class AddToCart {

	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//input[@name='removefromcart']") WebElement RemoveFromCart;
	
	private @FindBy(xpath ="//input[@name=\"updatecart\"]" ) WebElement UpdateCart;

	public WebElement getRemoveFromCart() {
		return RemoveFromCart;
	}

	public void setRemoveFromCart(WebElement removeFromCart) {
		RemoveFromCart = removeFromCart;
	}

	public WebElement getUpdateCart() {
		return UpdateCart;
	}

	public void setUpdateCart(WebElement updateCart) {
		UpdateCart = updateCart;
	}
	
}
