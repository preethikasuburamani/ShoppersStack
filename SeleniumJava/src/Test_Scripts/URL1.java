package Test_Scripts;

import org.testng.annotations.Test;

public class URL1 extends Browser_Setup{

	@Test
	public void amazon() {
		driver.get("https://www.amazon.in/");
		}
	
	
}
