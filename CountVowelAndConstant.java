package com.kn.countconstandvowel;

public class CountVowelAndConstant {

	public static void main(String[] args) {
		String a="fe dbeu dhd ei d dhui d";
		
		char[] drr=a.toCharArray();
		int vowel=0;
		int consonent=0;
		for(int i=0;i<=drr.length-1;i++) {
		if(drr[i]>='a'&&drr[i]<='z') {
			if(drr[i]=='a'||drr[i]=='e'||drr[i]=='i'||drr[i]=='o'||drr[i]=='u') {
				 vowel++;
			}
			else {
				consonent++;
			}
			
		}}
		System.out.println(vowel);
		System.out.println(consonent);
		

	}

}
