package com.vvc.programs;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		// Approach using Random
		Random random=new Random();
		int value_random_No=random.nextInt(100);// it will give Random Number within 100
		System.out.println(value_random_No); 
		double randomdbl=random.nextDouble();//it will ranges between 0.0 to 1.0
		System.out.println(randomdbl);
		//Approach using math class 
		//  no need to create math class here because its static method also by default method
		//By using this method we only generate decimal numbers 
		System.out.println(Math.random());
	}

}
