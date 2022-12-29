package com.vvc.programs;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		// To Count Numbers of Odd & Even in a digits
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num=sc.nextInt();
		
		int even_count=0; //To calculate the count of even & odd numbers....
		int odd_count=0;
		
		
		while(num>0)
		{
			int rem=num%10; // one by one remainder catch...
			
			if(rem%2==0)  // comparing that remainder to even or odd ....
				even_count++;
			else
				odd_count++;
			num=num/10;  // elimination  the numbers one by one...
		}
		System.out.println("Number of Even Digits >> "+even_count);
		System.out.println("Number of Odd Digits >> "+odd_count);
		
		sc.close();
	}

}
