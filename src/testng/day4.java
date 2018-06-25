package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day4 {
	@Test

	public void test4()
	{
		System.out.println("This is test4");
	}
	@Test(groups = {"Smoke"})
	public void apple4()
	{
		System.out.println("This is apple4");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I will run after suite");
	}
}
