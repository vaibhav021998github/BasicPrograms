package com.vvc.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int num=sc.nextInt(); //accept the input from user
		/* Logic No.1
		  int rev=0;
		while(num!=0) 456
		{
			rev=rev*10+num%10; 0+6=6 ->6*10+(45%10)=60+5=65 ->65*10+(4%10)->650+4=654
			num=num/10; 456/10=45 ->45/10=4-> 4/10=0...termination condition
		}
		System.out.println("Reverse Number is = "+rev);*/ //654 it reverse number
	
		/* Logic No.2
	StringBuffer sb=new StringBuffer(String.valueOf(num)); 
	StringBuffer rev =sb.reverse();
	System.out.println("Reverse Number is = "+rev);*/ 
		
		/* Logic No.3
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse Number is = "+rev);*/
	
	}
	}

		
		
		

