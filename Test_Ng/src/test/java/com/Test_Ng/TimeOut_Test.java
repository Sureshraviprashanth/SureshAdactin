package com.Test_Ng;

import org.testng.annotations.Test;

public class TimeOut_Test {
	@Test(timeOut=3000)
	private void OnlineOrders() throws Throwable {
		System.out.println("Shirt_Deleivered");
		Thread.sleep(2000);
		System.out.println("Pant_Deleivered");
		
		System.out.println("Socks_Deleivered");
		Thread.sleep(2000);
		System.out.println("Inners_Deleivered");
	}
	
	
}
