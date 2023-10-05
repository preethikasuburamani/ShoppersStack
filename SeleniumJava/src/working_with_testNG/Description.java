package working_with_testNG;

import org.testng.annotations.Test;

public class Description {

	@Test
	public void home()
	{
		System.out.println("frome Home page");
	}
	@Test(description = "registed sucessfully")
	public void register()
	{
		System.out.println("Register page");
	}
	@Test(description = "User is login")
	public void login()
	{
		System.out.println("Login page");
	}
	@Test(description = "User is sucessfully logout")
	public void logout()
	{
	System.out.println("logout page");	
	}
}
