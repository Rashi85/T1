package assertion_sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class NewTest {
	@Test
	public void f() {

		String actualresult = "ABC";
		String expectedresult = "XYZ";

		// Assert.assertEquals(actualresult,expectedresult);
		// Assert.assertTrue(5<2,"error msg");
		//Assert.fail();
		
		System.out.println("-------A--");
		Assert.fail("error msg");
		System.out.println("-----B-----");

	}
}
