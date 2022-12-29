package com.vvc.programs;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// To Count Numbers in a digit
		int count=0;
		Scanner sc=new Scanner(System.in); //taking inputs from user
		System.out.println("Enter the Numbers = ");
		int num=sc.nextInt();
		while(num>0) //
		{
			num=num/10; //for elimination of each numbers eg.1234->123->12->1->termination Condition
			count++ ; 
		}
		System.out.println("Numbers of Digit in a Number = " +count);

		sc.close();
	}

}
