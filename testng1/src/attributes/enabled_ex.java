package attributes;

import org.testng.annotations.Test;

public class enabled_ex {
  @Test(enabled=true)
  void f() {
	  System.out.println("first test case");
	  
  }
  
  @Test
  public void f1() {
	  System.out.println("second test case");
	  
  }
}
