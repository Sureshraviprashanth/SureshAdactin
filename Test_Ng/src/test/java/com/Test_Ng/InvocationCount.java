package com.Test_Ng;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=5)
	private void menShirt() {
		System.out.println("Shirt_Purchased");		
	}
	@Test
	private void menPant() {
		System.out.println("Pant_Purchased");		
	}
	@Test
	private void menInners() {
		System.out.println("Inners_Purchased");		
	}
	@Test
	private void menShoe() {
		System.out.println("Shoe_Purchased");		
	}
	@Test
	private void menSocks() {
		System.out.println("Socks_Purchased");		
	}

}
