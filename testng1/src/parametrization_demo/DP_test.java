package parametrization_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_test {

@DataProvider(name = "rashi")
public Object[][] dataProviderMethod() {
 
return new Object[][] { { "1. Sandeep" },
	{ "2. Swapnil" },
	{ "3. Nisha" } };
      }

@Test(dataProvider = "rashi")
public void testMethod(String data) {
 
System.out.println("Data is: " + data);
      }

@DataProvider(name = "rashi1")
public Object[][] dataProviderMethod1() {
 
return new Object[][] { { 19 }, { 2 }, { 43 } };
      }



@Test(dataProvider = "rashi1")
public void testMethod1(int data) {
 
System.out.println("Data is: " + data);
      }
}
