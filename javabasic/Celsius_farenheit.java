package javabasic;

import java.util.Scanner;

public class Celsius_farenheit {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius : ");
		double cel = in.nextDouble();
		double farhan = cel*9/5 + 32;
		System.out.println("The temperature of "+cel+" celsius is : "+farhan+" farhanheit");
			
		
		in.close();
	}


}
