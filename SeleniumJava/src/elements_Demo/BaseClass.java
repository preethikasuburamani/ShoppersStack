package elements_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {

	

	public BaseClass(WebDriver drive) {
		PageFactory.initElements(drive, this);
	}
	
	private @FindBy(partialLinkText="Register") WebElement Register;
	
	private @FindBy(partialLinkText = "Log in") WebElement Login;
	
	private @FindBy(xpath = "//span[text()='Shopping cart']") WebElement ShoppingCart;
	
	private @FindBy(xpath = "//span[text()='Wishlist']")WebElement Wishlist;
	
	private @FindBy(partialLinkText = "Books") WebElement BookLink;
	
	private @FindBy(partialLinkText = "Jewelry") WebElement jewelryLink;
	

	public WebElement getRegister() {
		return Register;
	}

	public void setRegister(WebElement register) {
		Register = register;
	}

	public WebElement getLogin() {
		return Login;
	}

	public void setLogin(WebElement login) {
		Login = login;
	}

	public WebElement getShoppingCart() {
		return ShoppingCart;
	}

	public void setShoppingCart(WebElement shoppingCart) {
		ShoppingCart = shoppingCart;
	}

	public WebElement getWishlist() {
		return Wishlist;
	}

	public void setWishlist(WebElement wishlist) {
		Wishlist = wishlist;
	}

	public WebElement getBookLink() {
		return BookLink;
	}

	public void setBookLink(WebElement bookLink) {
		BookLink = bookLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}
}