package javabasic;

public class picalculator {
	/*
	  pi = 4/1 - 4/3 + 4/5 - 4/7 + 4/9......
	  we can use Math.PI 
	 
	 */
	public double calculator(int nterms)
	{
		double numerator = 4.0;
		double denominator = 1.0;
		double sign = 1.0;
		
		double pi = 0.0;
		for(int i = 0 ; i< nterms;i++)
		{
			pi += (sign)*(numerator/denominator);
			denominator +=2;
			sign*=(-1);
		}
		return pi;		
	}
	
	public static void main(String[] args) {
	picalculator p = new picalculator();
	double pi = p.calculator(999_999_999);

	System.out.println("pi =  "+pi);
	double k = Math.PI;
	System.out.println("pi =  "+k);
	//System.out.println(Math.acos(-1.0));
	}	

}
