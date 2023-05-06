package com.string;

public class CountDigits {
	
	public static void main(String args[]) {
		
		String str="JVG87bd3?&s9";
		int count =0;
		StringBuilder digits=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
				digits.append(ch);
			}
		}
		
		System.out.println("Digits in string are: "+digits.toString());
	}
	

}
