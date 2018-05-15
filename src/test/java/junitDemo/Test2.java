package junitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
	
	@BeforeClass
	public static void  testBeforeClass() {
		System.out.println("����BeforeClass");
	}
	
	@Before
	public void testBefore() {
		System.out.println("����Before");
	}
	
	@Test
	public void test1() {
		System.out.println("����test1");
	}
	
	@Test
	public void test2() {
		System.out.println("����test2");
	}
	
	@Test
	public void test3() {
		System.out.println("����test3");
	}
	
	@After
	public  void testAfter() {
		System.out.println("����After");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("����AfterClass");
	}
	
}
	
	
