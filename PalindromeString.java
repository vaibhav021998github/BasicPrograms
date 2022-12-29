package com.vvc.programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str=sc.next();  //Accept input from the user 
		
		String orgStr=str;  // Taking variable for comparing the reverse string 
		
		String rev="";
		int length=str.length(); //calculate the String length
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if (orgStr.equals(rev)) // Reverse String and given String compare 
		{
			System.out.println("Palindrome String = "+orgStr); // if match found then it will display
		}
		else
		{
			System.out.println("Not Palindrome String = "+rev); // if match not found 
		}
		


		
		
		
		
		
		
	}

}
