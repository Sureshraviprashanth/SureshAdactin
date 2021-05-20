package com.selenium.com;

public class PojoExecution {
public static void main(String[] args) {
	Pojo po = new Pojo();
	po.setA(45);
	int a = po.getA();
	System.out.println(a);
	po.setName("Ram");
	String name = po.getName();
	System.out.println(name);
	po.setName("Dhoni");
	String fav = po.getName();
	System.out.println(fav);
	
}
}
