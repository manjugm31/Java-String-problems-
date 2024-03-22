package com.kn.anagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="bat";
		String b="tab";
		char c[]=a.toCharArray();
		char d[]=b.toCharArray();
//		for(int i=0;i<c.length;i++) {
			Arrays.sort(c);
			Arrays.sort(d);
			String e=new String();
			String f=new String();
			
			if(e.equals(fn)) {
				System.out.println("yes it is anagram");
		}
			else {
				System.out.println("no");
			}
		

	}

}
