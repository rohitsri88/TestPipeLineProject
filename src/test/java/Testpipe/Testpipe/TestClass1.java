package Testpipe.Testpipe;

import org.testng.annotations.Test;

public class TestClass1 extends BaseTestClass{

	@Test
	public void test1()
	{
		System.out.println("Its Test Case 1");
		System.out.println("Title 1------------>"+driver.getTitle());
	}
	@Test
	public void test2()
	{
		System.out.println("Its Test Case 2");
		System.out.println("Title 2------------>"+driver.getTitle());
	}
	@Test
	public void test3()
	{
		System.out.println("Its Test Case 3");
		System.out.println("Title 3------------>"+driver.getTitle());
	}
	
}
