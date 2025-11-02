package testng_demo_Annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_demo
{
	@Test
	public void A()
	{
		System.out.println("TC-01 PASS");
	}
	
	@Test
	public void B()
	{
		System.out.println("TC-02 PASS");
	}

	@BeforeTest
	public void BTest()
	{
		System.out.println("Before test executed..");
	}
}
