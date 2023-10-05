package working_with_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_AfterTest {

	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println("From Before Suit");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("from befor test");
	}
	@BeforeClass()
	public void BeforeClass()
	{
		System.out.println("From Before Class");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
	public void test()
	{
		System.out.println("from 1st @test annotation");
	}
	@Test
	public void test1()
	{
		System.out.println("from 2nd @test annotaion");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("from After method");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("from after Class");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("From After Test");
	}
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("from after Suit");
	}

}
