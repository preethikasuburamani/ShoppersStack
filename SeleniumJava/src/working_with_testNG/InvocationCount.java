package working_with_testNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	public void home()
	{
	System.out.println("whatsApp home page");	
	}
	
	@Test(dependsOnMethods = "home")
	public void contact()
	{
		System.out.println("contact number");
	}
	@Test(dependsOnMethods = "contact",invocationCount = 3)
	public void message()
	{
	System.out.println("message is sented");
	}

}
