package javabasic;

import java.util.Scanner;

public class usingUnderscore_inLiteral {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cn = 12_3;
		System.out.println(cn);
		int c1n = 0x7_B;
		System.out.println(c1n);
		int c2n = 0b1111_0_11;
		System.out.println(c2n);
		int c3n = 0_173;
		System.out.println(c3n);
		in.close();
	
	}

}
