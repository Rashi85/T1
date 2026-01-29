package attributes;

import org.testng.annotations.Test;

public class dependsonmethods_demo {
	@Test(timeOut=200)  
	public void WebStudentLogin() throws InterruptedException  
	{ Thread.sleep(300);
	System.out.println("Student login through web");  
	}  
	
	
	@Test
	public void MobileStudentLogin()  
	{  
	System.out.println("Student login through mobile");  
	} 
	
	
	@Test(dependsOnMethods= {"WebStudentLogin"})  
	public void APIStudentLogin()  
	{  
	System.out.println("Student login through API");  
	}  
}
