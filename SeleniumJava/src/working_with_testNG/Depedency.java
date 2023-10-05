package working_with_testNG;

import org.testng.annotations.Test;

public class Depedency {

	@Test(priority = 1)
	public void home()
	{
		System.out.println("home page");
	}
	@Test
	public void login()
	{
		System.out.println("login page");
	}
	@Test (dependsOnMethods = "logout")
	public void register()
	{
		System.out.println("register page");
	}
	@Test(dependsOnMethods = "register")
	public void logout()
	{
		System.out.println("logout page");
	}
}
