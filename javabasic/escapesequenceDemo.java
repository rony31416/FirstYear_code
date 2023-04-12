package javabasic;

public class escapesequenceDemo {
	

	public static void main(String[] args)
	{
		String paragraph = "The roaring fans saw \n"
				+ "their beloved \"Tigers\" create another \n"
				+ "\tbit of history in their favorite \n"
				+"den last night. ";
		
		//we can use TextBlockBemo
		/*String paragraph = """
		      The roaring fans saw
				their beloved "Tigers" create another
				bit of history in their favourite
			  den last night.
				
				"""
		 */
		 
		System.out.println(paragraph);
	   
	}
	

}
