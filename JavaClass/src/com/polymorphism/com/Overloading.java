package com.polymorphism.com;

public class Overloading {
	//same class 
	//same method
	//different arguements
	
	public void findStudent(String name, int empId) {
		
	System.out.println("name,empId:"+name+" "+empId);
	
	}
	public static void main(String[] args) {
		
		Overloading O = new Overloading();
		O.findStudent("Suresh",180560);
		
		
	}
	
	
	
	
	
	
	
	

}
