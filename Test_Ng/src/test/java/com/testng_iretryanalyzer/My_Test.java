package com.testng_iretryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
	@Test
	private void credentials() {

		String UserName = "SureshPrashanth";
		
		String ActualName = "MahendraSinghDhoni";
		
		Assert.assertEquals(UserName, ActualName);
			

	}

}
