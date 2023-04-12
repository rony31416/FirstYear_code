package javabasic;

import java.util.Scanner;

public class QuadraticEquationSolve {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("ax^2+bx+c = 0");
		System.out.println("enter a,b,c ");
		double a,b,c;
		a =in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		if(b*b - 4*a*c < 0) {
			System.out.println("solution is not possible");
		}
		else {
			double x1 = (-b+Math.sqrt(b*b-4.0*a*c))/(2*a);
			double x2 =  (-b-Math.sqrt(b*b-4*a*c))/(2.0*a);
			System.out.println("x1 = "+x1+" and x2 is = " +x2);
			
			
		}
		
		in.close();
	}

}
