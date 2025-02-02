package testscript;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
public class Annotations {
	
@Test(description="test case 1",priority=1)
	public void testCase()
	{
		System.out.println("Test case");
	}
@Test(description="test case 2",priority=2)
public void testCase2()
{
	System.out.println("Test case2");
}

@BeforeMethod
public void beforeMethod()
{
	System.out.println("before method");
}

 @AfterMethod
public void AfterMethod()
{
	System.out.println("after method");
}
 @BeforeTest
 public void beforeTest()
 {
 	System.out.println("before test");
 }

  @AfterTest
 public void AfterTest()
 {
 	System.out.println("after test");
 }
  
  @BeforeClass
  public void beforeClass()
  {
  	System.out.println("before class");
  }

   @AfterClass
  public void AfterClass()
  {
  	System.out.println("after class");
  }
   @BeforeSuite
   public void beforeSuite()
   {
   	System.out.println("before suite");
   }

    @AfterSuite
   public void AfterSuite()
   {
   	System.out.println("after suite");
   }
}
