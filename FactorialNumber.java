package com.vvc.programs;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// To Calculate the factorial of a number...
		long factorial=1;
		Scanner sc =new Scanner(System.in); // taking in input from the user
		System.out.println("Enter the Number = ");
		int num=sc.nextInt();  // eg. take factorial of 5!
		/* Approach 1
		 * for(int i=1;i<=num;i++)  // it goes to 1*2*3*4*5
		{
			factorial=factorial*i; // for iteration 1->2->6->24->120...termination
		}
		System.out.println("Factorial of a given Number is >> "+factorial);
	}*/
		// Approach 2
		for(int i=num ;i>=1;i--) // it goes like 5*4*3*2*1
		{
			factorial=factorial*i; // for iteration->5*->20->60->120->120...termination
		}
		System.out.println("Factorial of a given number is >> "+factorial);
} 
}
