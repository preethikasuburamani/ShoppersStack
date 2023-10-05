package working_with_testNG;

import org.testng.annotations.Test;

public class Always_Run {

	@Test
	public void home()
	{
		System.out.println("frome Home page");
	}
	@Test
	public void register()
	{
		System.out.println("Register page");
		int A =10/0;
	}
	
	@Test(dependsOnMethods = "register",enabled = true,alwaysRun = true)
	public void login()
	{
		System.out.println("Login page");
	}
	
	@Test
	public void logout()
	{
	System.out.println("logout page");	
	}
}
