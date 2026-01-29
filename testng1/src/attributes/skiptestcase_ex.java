package attributes;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptestcase_ex {
	boolean flag = true;
  @Test
  public void f() {
	  if(flag)
		  throw new SkipException("custom error msg : skipp the test case");
	  System.out.println("hello");
  }
}
