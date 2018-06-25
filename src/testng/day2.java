package testng;

import org.testng.annotations.Test;

public class day2 {
	@Test

	public void test2()
	{
		System.out.println("This is test2");
	}
	@Test(groups = {"Smoke"})
	public void apple2()
	{
		System.out.println("This is apple2");
	}
	@Test
	public void appledolly()
	{
		System.out.println("This is appledolly");
	}
	
}
