package com.Test_Ng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Class {
	
	@Test(dataProvider = "test_Data")
	private void Credentials(String username, int password) {
		System.out.println("Username= "+username);
		System.out.println("PAssword= "+password);
	}
	@DataProvider
	private Object[][] test_Data() {
		return new Object[][] {
			{"Dhawan", 111},
			{"Rohit", 222},
			{"Dhoni",777}
			
		};

	}

}
