package com.Test_Ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {

	@BeforeSuite
	private void setproperty() {
		System.out.println("Set_Property");
	}
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("ChromeDriver");

	}
	@BeforeClass
	private void url() {
		System.out.println("Mantra");

	}
	@BeforeMethod
	private void login() {
		System.out.println("SignIn");
	}
	@Test
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
	@AfterMethod
	private void logOut() {
		System.out.println("SignOut");
	}
	@AfterClass
	private void myntraHome() {
		System.out.println("Check_MyntraHome");
	}
	@AfterTest
	private void close() {
		System.out.println("Close");
	}
	@AfterSuite
	private void deleteAll() {
		System.out.println("DeleteAllCookies");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
