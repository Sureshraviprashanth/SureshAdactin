package com.Test_Ng;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Validation_HardAssert {
	
	@Test
	private void demoHardAssert() {

		// AssertEquals--->Remaining Program Does Not Execute if Assert Fails.

		String UserName = "SureshPrashanth";
		String ActualName = "MahendraSinghDhoni";
		System.out.println("username check");
		Assert.assertEquals(UserName, ActualName);
		System.out.println("UserName is equal to actual name");

	}
	
	@Test
	private void demoHardAssert2() {

		// AssertNotEquals--->Remaining Program Does Not Execute if Assert Fails.

		String UserName = "SureshPrashanth";
		String ActualName = "MahendraSinghDhoni";
		System.out.println("username check");
		Assert.assertNotEquals(UserName, ActualName);
		System.out.println("UserName is not equal to actual name");

	}
	
	@Test
	private void demoHardAssert3() {

		// AssertNull--->To check whether the value is Null
		
		String UserName = null;
		String ActualName = "MahendraSinghDhoni";
		System.out.println("username check");
		Assert.assertNull(UserName);
		System.out.println("UserName is null");

	}
	

}
