package com.constructor.com;

public class Inherit2 {
	public Inherit2(String name, int Id) {
		System.out.println("it is a parametrised constructor named "+name);
		System.out.println("paramterised constructor number is" +Id);
	}
	public Inherit2(int Id) {
		System.out.println("it is a parameterized constructor number ");
	}
public static void main(String[] args) {
	Inherit2 i2= new Inherit2("don", 7);
	Inherit2 I =  new Inherit2(153);
	
}
}
