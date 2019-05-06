package Testpipe.Testpipe;

import org.testng.annotations.Test;

public class TestClass2 extends BaseTestClass{

	@Test
	public void test4()
	{
		System.out.println("Its Test Case 4");
		System.out.println("Title 4------------>"+driver.getTitle());
	}
	@Test
	public void test5()
	{
		System.out.println("Its Test Case 5");
		System.out.println("Title 5------------>"+driver.getTitle());
	}
	@Test
	public void test6()
	{
		System.out.println("Its Test Case 6");
		System.out.println("Title 6------------>"+driver.getTitle());
	}
	
}
