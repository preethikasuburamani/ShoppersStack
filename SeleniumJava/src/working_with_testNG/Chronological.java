package working_with_testNG;

import org.testng.annotations.BeforeSuite;

public class Chronological {
 @BeforeSuite
 public void beforeSuit()
 {
	 System.out.println("This is from the Before Suit");
 }
}
