package javabasic;
import java.util.*; 

public class LogTable {
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("| n\tlog10(n)   \t log2(n)   \t loge(n)  |");
		//System.out.println("|-------------------------------------------------|");
		int n = 1;
		while(n<=10)
		{
			double log10 = Math.log10(n);
			double log2 = Math.log(n) / Math.log(2);
			double loge = Math .log(n);
			String row = String.format("|%2d"+"|\t%.6f  |\t%.6f"+"  |\t%.6f  |",n,log10,log2,loge);
			System.out.println("|-------------------------------------------------|");
			System.out.println(row);
			n++;
			
			
		}
		
		//System.out.println("|-------------------------------------------------|");
		System.out.println("|_________________________________________________|");
		
		
		
		
		in.close();
		
	}
	

}
