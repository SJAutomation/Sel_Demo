package testng_demo_Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{
	@Test
	public void AA()
	{
		System.out.println("A A");
	}
	
	@Test
	public void Aa()
	{
		System.out.println("A a");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("Before test executed");
		
	}
	@AfterTest()
	public void AT()
	{
	
		System.out.println("After test executed");
		
	}

}
