package com.vvc.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int orginalNum=num;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10+num%10;
		num=num/10;
	}
	if(rev==orginalNum)
	{
	System.out.println("Palindrome Number - "+orginalNum);
	}
	else
	{
		System.out.println("Not Palindrome Number");
	}
	}

}
