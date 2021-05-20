package com.Test_Ng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification_SoftAssert {
	@Test
	private void demoSoftAssert() {

		//Verification
		// AssertEquals--->Remaining Program will Execute even if Assert Fails.

		String UserName = "SureshPrashanth";
		String ActualName = "MahendraSinghDhoni";
		SoftAssert sa = new SoftAssert(); 
		sa.assertEquals(ActualName, UserName);
		System.out.println("Verification Done");
	
	}
}
