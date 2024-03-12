package Com.kn.caseconverter;

import java.util.Scanner;

public class CaseConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter he input-");
		String input=scan.nextLine();
		String output=swap(input);
		System.out.println(output);
		
		

	}

	private static String swap(String input) {
		char c[]=input.toCharArray();
		StringBuilder sb=new StringBuilder();
		for( char ch : c)
		if(Character.isLowerCase(ch)) {
			sb.append(Character.toUpperCase(ch));
		}
		else if(Character.isUpperCase(ch)) {
			sb.append(Character.toLowerCase(ch));
		}
		else {
			sb.append(ch);
		}
		
		return sb.toString();
	}

}
