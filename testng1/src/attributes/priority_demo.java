package attributes;

import org.testng.annotations.Test;

public class priority_demo {
  @Test(priority=1)
  public void zebra() {
	  System.out.println("one");
  }
  
  
  @Test(priority=5)
  public void b() {
	  System.out.println("two");
  }
  
  @Test
  public void c() {
	  System.out.println("three");
  }
}
