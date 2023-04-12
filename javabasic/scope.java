package javabasic;

public class scope {
	
  

	public static void main(String[] args)
	{
		
	  int x =10,y=0;
	  if(x ==10)
	  { 
		  y = 20;
		  x = y*2;
	  }
	 
	  
	  System.out.println(x);
	  System.out.println(y);
	}
}
