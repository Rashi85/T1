package attributes;

import org.testng.annotations.Test;

public class timeout_demo {
	 @Test
	  public void f1() {
		  System.out.println("one");
	  }
	  
	  @Test(timeOut=200)
	  public void f2() throws InterruptedException {
		  Thread.sleep(500);
		  System.out.println("two");
	  }
	  
	  @Test
	  public void f3() {
		  System.out.println("three");
	  }
}
