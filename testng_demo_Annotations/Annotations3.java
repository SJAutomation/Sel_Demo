package testng_demo_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	@BeforeTest
	public void setup()
	{
		System.out.println("Before TEST");
	}
	
	@Test(enabled=true, priority = 0, invocationCount = 3)
	public void A()
	{
		System.out.println("TC-01");
		
	}
	
	@Test(enabled = true, priority = -1) //by default True no need to write(To skip TC we use this)
	public void B()
	{
		System.out.println("TC-02");
		
	}
	
	@Test(enabled=true, priority = 1)
	public void C()
	{
		System.out.println("TC-03");
	}
	
	@AfterTest
	public void End()
	{
		System.out.println("After TEST");
		
	}
	
	
	
	
}
