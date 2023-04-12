package javabasic;

import java.util.Scanner;

public class inch_to_meter {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length in inch : ");
		double inch = in.nextDouble();
		double meter = inch*0.0254;
		System.out.println("The length of "+inch+" inch is : "+meter+" meter");
		
		in.close();
	
		
	}

}
