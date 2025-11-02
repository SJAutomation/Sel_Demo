package sel2;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssertions {

	
	@Test(priority=2)
	public void testHard()
	{
		System.out.println("Test case Hard started..");
		org.testng.Assert.assertEquals('a', 'a',"Both are not same");

		System.out.println("Test case Hard completed..");
		
	}
	
	@Test(priority = 1)
	public void testSoft()
	{
		/*System.out.println("Test Hard started");
		Assert.assertEquals('A', 'a');
		System.out.println("Test Hard Completed");  */
		  
		 SoftAssert ass=new SoftAssert();
		 System.out.println("Test Soft started");
		
		  ass.assertEquals(12,13);
	    System.out.println("Comparison done...");
	    System.out.println("Test Soft Completed");
		//ass.assertAll();
		
		
	}
	
	
	
	  @Test(priority=0,description="In this fun, we are going to login into the application")
	  public void loginfun() {
		  System.out.println("Hey this is login Script....");
		  //Assert.assertEquals(12, 13);
		 // SoftAssert s=new SoftAssert();
		  Assert.assertEquals(true, false);
		 // s.assertEquals(true, false);
		  System.out.println("Hey this is login failed Script....");
	  }
	  
	  @Test(priority=1)
	  public void cheout() {
		  System.out.println("Hey this is checkout Script....");
	  }
	
	
}
