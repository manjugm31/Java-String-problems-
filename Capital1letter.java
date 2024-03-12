package com.kn.capital;

import java.util.Scanner;

public class Capital1letter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the input-");
		String input=scan.nextLine();
		String output=capital(input);
		System.out.println(output);
		

	}

	private static String capital(String input) {
		StringBuilder sb=new StringBuilder();
		if(!input.isEmpty()) {
			sb.append(Character.toUpperCase(input.charAt(0)));
		}
		for(int i=1;i<input.length();i++) {
			  if(input.charAt(i-1)==' ') {
				sb.append(Character.toUpperCase(input.charAt(i)));
			}
			else {
				sb.append(input.charAt(i));
			}
		}
		
		return sb.toString();
		
	}

}
