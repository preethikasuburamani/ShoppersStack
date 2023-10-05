package Demo_TestScript;

import org.testng.annotations.Test;

import Project_Pratice.base_class;
import elements_Demo.AddToCart;
import elements_Demo.BaseClass;
import elements_Demo.JewelryPage;

public class TC_AddToCart_001 extends base_class {
	
	@Test
	public void login() {
		//click on Jewelry Link
		BaseClass BC = new BaseClass(driver);
		BC.getJewelryLink().click();
		
		//CLick on Diamond and Heart
		JewelryPage JP = new JewelryPage(driver);
		JP.getDiamondHeart().click();
		
		//click on Add to Cart
		JP.getAddToCart().click();
		
		//click on Shopping Cart
		BC.getShoppingCart().click();
		
		//click on Remove frome cart
		AddToCart cart = new AddToCart(driver);
		cart.getRemoveFromCart().click();

		//click on update cart
		cart.getUpdateCart().click();
	}
}
