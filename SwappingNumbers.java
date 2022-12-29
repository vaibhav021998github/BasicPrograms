package com.vvc.programs;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) 
	{ 
		// Logic No.1
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No1. -");
		int a=sc.nextInt();
		System.out.println("Enter the No2. -");
		int b=sc.nextInt(); 
		int temp=a; //storing a=30 value in "temp" variable 
		 a=b; // storing b=20 value in "a" variable
		 b=temp; // storing 30 value given to the variable "b"
		 System.out.println(a);
		 System.out.println(b); 
		 
		 System.out.println("===========================");
		 System.out.println("===========================");
		 */ 
		// Logic No.2
		int a=100, b=120;
		  a=a+b;	//10+20=30
		 b=a-b;		//30-20=10
		 a=a-b;		//30-10=20
		 System.out.println("Swapping of Two Numbers -");
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 
	}

}
