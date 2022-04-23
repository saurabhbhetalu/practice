package TestNG1;

import org.testng.annotations.Test;

public class Test01 
{
	@Test(priority=1,invocationCount =5)
	public void testA()
	{
		System.out.println("TestA");
	}

	@Test(priority=2,invocationCount =5)
	public void testB()
	{
		System.out.println("TestB");
	}
	
	@Test(invocationCount=0,priority=3)
	public void testC()
	{
		System.out.println("TestC");
	}
	
	@Test(priority=4)
	public void testD()
	{
		System.out.println("TestD");
	}
	
	@Test(priority=3)
	public void testE()
	{
		System.out.println("TestE");
	}

}



