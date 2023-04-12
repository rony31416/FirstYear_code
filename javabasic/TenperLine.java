package javabasic;

public class TenperLine {
	public static void main(String[] args) 
	{
		int n = 1;
		while(n<=200) {
			
			String f = String.format("%3d\t",n);
			System.out.print(f);
			if(n%10==0)System.out.println();
			n++;
		}
		
		
	}
	
}
