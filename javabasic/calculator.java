package javabasic;

import java.util.*; 

public class calculator {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("choose an operator : + - * /" );
		
		char operator = in.next().charAt(0);
		
		System.out.println("Enter first number : ");
		double n1 = in.nextDouble();
		System.out.println("Enter second number: ");
		double n2 = in.nextDouble();
		
		double result = switch( operator ) {
		
		case '+' -> n1 + n2;
		case '-' -> n1 - n2;
		case '*' -> n1*n2;
		case '/' -> n1/n2;
		
		default ->{
			System.out.println("Invalid operator -__-");
			yield 0;
		}
		
		};
				
		System.out.println("Result : " +result);
			in.close();
	}

}
