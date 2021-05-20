package com.Test_Ng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleSet_Parametrized {
	
	@Test
	@Parameters({"username","password"})
	private void credentials(String username, @Optional("070781")int password) {
		System.out.println("UserName: "+username);
		System.out.println("Password: "+password);		
	}
	
	

}
