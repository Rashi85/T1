package pkg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("----before test---");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("---Aftertest-----");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("-------AfterMethod---------");
	}


	@Test
	public void f1() {
		System.out.println("------First Test case----");
	}

	@Test
	public void f2() {
		System.out.println("------second Test case----");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("-------BeforeMethod----");

	}

	
}
