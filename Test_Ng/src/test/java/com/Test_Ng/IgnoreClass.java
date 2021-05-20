package com.Test_Ng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreClass {
	
	@Test
	private void menShirt() {
		System.out.println("Shirt_Purchased");		
	}
	@Test
	private void menPant() {
		System.out.println("Pant_Purchased");		
	}
	@Ignore
	@Test
	private void menInners() {
		System.out.println("Inners_Purchased");		
	}
	@Test
	private void menShoe() {
		System.out.println("Shoe_Purchased");		
	}
	@Test(enabled= false)
	private void menSocks() {
		System.out.println("Socks_Purchased");		
	}

}
