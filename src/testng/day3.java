package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	@Test

	public void test2()
	{
		System.out.println("This is test3");
	}
	@Test
	public void apple2()
	{
		System.out.println("This is apple3");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("I will run after test");
	}
}
