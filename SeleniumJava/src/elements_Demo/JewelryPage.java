package elements_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {

	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//input[@value='Add to cart']/../../..//a[text()='Black & White Diamond Heart']") WebElement DiamondHeart;
	
	private @FindBy(xpath = "//input[@value='Add to cart'and@id]") WebElement AddToCart;
	public WebElement getAddToCart() {
		return AddToCart;
	}
	public void setAddToCart(WebElement addToCart) {
		AddToCart = addToCart;
	}
	public WebElement getDiamondHeart() {
		return DiamondHeart;
	}
	public void setDiamondHeart(WebElement diamondHeart) {
		DiamondHeart = diamondHeart;
	}
	
	
	
}
