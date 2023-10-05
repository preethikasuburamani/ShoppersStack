package Test_Scripts;

import org.testng.annotations.Test;

public class URL2 extends Browser_Setup{

	@Test
	public void flipkat()
	{
		driver.get("https://www.flipkart.com/");
	}
}
