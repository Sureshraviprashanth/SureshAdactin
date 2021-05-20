package com.collections.com;
import java.util.LinkedList;
import java.util.List;

public class Demo_Collections {
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(55);
		li.add(55);
		li.add(85);
		System.out.println(li);
	 
		int size=li.size();
		System.out.println(size);
		
		int get=li.get(5);
		System.out.println(get);
		
		boolean contains=li.contains(55);
		System.out.println(contains);
		
		li.remove(1);
		System.out.println(li);
		
		int get2=li.get(2);
		System.out.println(get2);
		
		int index=li.indexOf(20);
		System.out.println(index);
		
		int set = li.set(2, 180560);
		System.out.println(li);
		
		
	}

}
