package pkg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
	@BeforeClass
	public void beforeclass() {
		System.out.println("---beforeclass--");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("---Afterclass--");
	}
	
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
