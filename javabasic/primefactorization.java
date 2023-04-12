package javabasic;

import java.util.*; 

public class primefactorization {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long n = in.nextLong();
		System.out.println("Prime factors of "+n+" are : ");
		
		for(long i = 2 ; i < n/i;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n = n/i;
			}
		}
		
		if(n > 1) System.out.println(n);
		in.close();
		
	}
}
