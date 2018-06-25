package testngReg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day8 {
	@Test

	public void test4()
	{
		System.out.println("This is test8");
	}
	@Parameters({"URL"})
	@Test
	public void apple4(String urlname)
	{
		System.out.println("This is apple8");
		System.out.println("URL name is: " +urlname);
	}
}
