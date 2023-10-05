package Project_Pratice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Jewellry_001 extends base_class {
	
	@Test
	public void clickOnJewellry() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
	}

}
