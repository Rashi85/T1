package runparallel;

import org.testng.annotations.Test;

public class parallel_ex {
  @Test
  public void f1() {
	  System.out.println("one");
  }
  
  @Test
  public void f2() {
	  System.out.println("two");
  }
  
  @Test
  public void f3() {
	  System.out.println("third");
  }
  @Test
  public void f4() {
	  System.out.println("four");
  }
}
