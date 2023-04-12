package javabasic;

import java.util.Scanner; 
import java.util.*; 
public class bubblesort {
	
	static void bubble_sort(ArrayList<Integer> A,int size)
	{
		for(int i = 0 ; i< size ; i++)
		{
			for(int  j = 0 ,temp; j < size - 1 ;j++)
			{
				if(A.get(j) > A.get(j+1))
				{
					
					A.set(temp,A.get(j));
					A.set(A.get(j+1), A.get(j));
					A.set(A.get(j),temp);
					
					
			    }
			}
		}
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		//get the size of  Array List
		System.out.println("Enter the size of the array");
		int n  = in.nextInt();
		int temp ;
		//gets all array elements
		System.out.println("Enter all elements");
		for(int  i = 0 ; i< n ; i++)
		{
			int x = in.nextInt();
			ar.add(x);
		}
		
		//for printing the array after sorting
		System.out.println("prints the array after sorting");
		for(int  i = 0 ; i< n ; i++)
		{
			System.out.print(ar.get(i)+" ");
		}
		
		//calling sorting function
		bubble_sort(ar,n);
		
		//for printing the array before sorting
		for(int  i = 0 ; i< n ; i++)
		{
			System.out.print(ar.get(i)+" ");
		}
		
		in.close();
		
		
	}
}
