package assertion_sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class softass_ex {
	@Test
	public void f() {

		
		SoftAssert st = new SoftAssert();
		st.assertEquals("ABC","ABC");
		st.assertEquals("ABC","AB");//fail
		st.assertTrue(5>11,"error msg");//fail
		st.fail("error");//fail
		
	st.assertAll();
		
	}
}
