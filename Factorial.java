package com.in28minutes.loops.examples;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=scanner.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
        
	}

}
