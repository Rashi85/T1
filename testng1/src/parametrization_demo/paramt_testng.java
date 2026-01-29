package parametrization_demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class paramt_testng {
  @Test
  @Parameters("Name")
  public void f(String Name) {
	  System.out.println("customer name is " +Name );
  }
}
