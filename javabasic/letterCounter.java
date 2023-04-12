
package javabasic;

import java.util.*; 
public class letterCounter{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter character: ");
		
		String s = in.nextLine();
		s = s.toLowerCase();
		char[] letter = s.toCharArray();
		
		int[] cnt = new int[26];
		for(int i = 0 ; i < letter.length;i++)
		{
			char let =letter[i];
			if(Character.isLetter(let))
			{
				int indx = let - 'a';
				cnt[indx]++;	
			}			
		}
		
		System.out.println("Letter counts : ");
		for(int i = 0 ; i< cnt.length;i++)
		{
			if(cnt[i] != 0 )
			{
				char let  = (char)(i + 'a');
				System.out.println(let+" : "+cnt[i]);
			}
			
		}
		 
		
		in.close();
		
		
	}
	
}

