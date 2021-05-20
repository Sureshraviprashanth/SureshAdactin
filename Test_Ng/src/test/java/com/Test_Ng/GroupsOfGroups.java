package com.Test_Ng;

import org.testng.annotations.Test;

public class GroupsOfGroups {
	@Test(groups ="Fashion")
	private void menShirt() {
		System.out.println("Shirt_Purchased");		
	}
	@Test(groups ="Education")
	private void pen() {
		System.out.println("Pen_Purchased");		
	}
	@Test(groups ="Fashion")
	private void menInners() {
		System.out.println("Inners_Purchased");		
	}
	@Test(groups ="Education")
	private void books() {
		System.out.println("Books_Purchased");		
	}
	@Test(groups ="Education")
	private void guide() {
		System.out.println("Guide_Purchased");		
	}
	@Test(groups ="Fashion")
	private void menPant() {
		System.out.println("Pant_Purchased");		
	}
	@Test(groups ="Electronics")
	private void mobile() {
		System.out.println("Mobile_Purchased");		
	}
	@Test(groups ="Electronics")
	private void laptop() {
		System.out.println("Laptop_Purchased");		
	}


}
