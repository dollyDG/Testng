package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void test1()
	{
		System.out.println("This is test1");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I will run before test");
	}

	@Test(dependsOnMethods = {"testng.test1"})
	public void apple()
	{
		System.out.println("This is apple");
	}
	@Test(enabled =false)
	public void testme()
	{
		System.out.println("This is testme");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I will run before suite");
	}

}
