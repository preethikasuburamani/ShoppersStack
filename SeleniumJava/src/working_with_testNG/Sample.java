package working_with_testNG;

import org.testng.annotations.Test;

public class Sample

{
	
	@Test
	public void login()
	{
		System.out.println("login is displyed");
	}
	@Test
	public void logout() {
		System.out.println("Logout is displayed");
	}
	@Test
	public void Login()
	{
		System.out.println("Login");
	}
	@Test
	public void Amount()
	{
		System.out.println("Amount");
	}
}
