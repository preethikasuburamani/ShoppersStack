package working_with_testNG;

import org.testng.annotations.Test;

public class Priority {
	final int a =8;
	
	@Test(priority = a)
	public void user()
	{
		System.out.println("when we ask the priority from user then the variable should be Finail");
	}
	
	@Test(priority = 1)
	public void home() {
		System.out.println("home page is displayed 1");
	}
	@Test
	public void Default()
	{
		System.out.println("default priority will be zero");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("Login page is displayed 2");
	}
	
	@Test(priority = 8)
	public void logout() {
		System.out.println("Logout is displayed 8");
	}
	
	@Test(priority = 3)
	public void product()
	{
		System.out.println("product page is displayed 3");
	}
	
	@Test(priority = 5)
	public void payment()
	{
		System.out.println("payment is sucessfuly 5");
	}
	@Test(priority = 4)
	public void AddtoCart()
	{
		System.out.println("product is added to cart 4");
	}
	@Test(priority = 6)
	public void Shipping()
	{
		System.out.println("Shipping detail 6");
	}
	@Test(priority = 7)
	public void Delivered()
	{
		System.out.println("product is delivered 7");
	}
	

}
