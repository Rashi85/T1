package attributes;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groups_demo {
	
	@BeforeGroups("Rashi")
	public void beforegrp()  
	{  
	System.out.println("before group setting");  
	} 
	
	
	@AfterGroups("Rashi")
	public void aftergrp_xyz()  
	{  
	System.out.println("after group setting");  
	} 
	
	
	
	@Test(groups= {"Rashi"})    
	public void WebStudentLogin()  
	{  
	System.out.println("Student login through web");  
	}  
	
	
	@Test  
	public void MobileStudentLogin()  
	{  
	System.out.println("Student login through mobile");  
	} 
	
	
	@Test(groups= {"Rashi"})  
	public void APIStudentLogin()  
	{  
	System.out.println("Student login through API");  
	}  
}
