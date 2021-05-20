package com.scanner.com;
import java.util.Scanner;

public class Marksheet {
	
	public static void main(String[] args) {
		
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your name:");
    String A = sc.next();
    System.out.println("Entered Name is "+A);
    
    System.out.println("Enter your RollNo:");
    int I = sc.nextInt();
    System.out.println("Entered RollNo is "+I);
    
    System.out.println("Enter your maths mark:");
    int M = sc.nextInt();
	System.out.println("Entered maths mark is "+M);
	
	System.out.println("Enter your science mark:");
	int S = sc.nextInt();
	System.out.println("Entered science mark is "+S);
	
	System.out.println("Enter your group(Science/commerce/Computer):");
	String C = sc.next();
	System.out.println("Entered group is "+C);
	
	System.out.println("Enter your group mark");
	int Gm = sc.nextInt();
	System.out.println("Enter your group mark is "+Gm);
	
	int T= (M+S+Gm)/3; 
	System.out.println("Your cutoff mark is :"+T);
	}

}
