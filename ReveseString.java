package com.vvc.programs;

import java.util.Scanner;

public class ReveseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String = ");
		String str1=sc.next();
		String rev="";
		/* LOGIC NO.1*/
		int length=str1.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str1.charAt(i);
		}
		System.out.println("String Reversed =  "+rev);
		
		
		/*LOGIC NO.2
		StringBuffer sb =new StringBuffer(str1);
		System.out.println("Reverse String = "+sb.reverse());*/
		
		/*LOGIC NO.3
		char a[]=str1.toCharArray();
		int length=a.length;
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a[i];	
		}
		System.out.println("Rever String = "+rev);
		
		*/
	}

}
