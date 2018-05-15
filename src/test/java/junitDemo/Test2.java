package junitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {
	
	@BeforeClass
	public static void  testBeforeClass() {
		System.out.println("我是BeforeClass");
	}
	
	@Before
	public void testBefore() {
		System.out.println("我是Before");
	}
	
	@Test
	public void test1() {
		System.out.println("我是test1");
	}
	
	@Test
	public void test2() {
		System.out.println("我是test2");
	}
	
	@Test
	public void test3() {
		System.out.println("我是test3");
	}
	
	@After
	public  void testAfter() {
		System.out.println("我是After");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("我是AfterClass");
	}
	
}
	
	
