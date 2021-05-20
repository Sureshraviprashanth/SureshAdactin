package com.Test_Ng;

import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions= ArithmeticException.class)
	private void ExpectedEx() {
		int a= 10;
		System.out.println(a/0);
	}

}
