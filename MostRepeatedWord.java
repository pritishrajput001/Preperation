package com.string;

public class MostRepeatedWord {
	
	
	
	public static void main(String args[]) {
		String str ="Hello pritish pritish how are you pritish";
		
		String[] words =str.split(" ");
		String mostRepeated=null;
		int maxCount=0;
		
		
		for(int i=0;i<words.length;i++) {
			int count =0;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
				}
			if(count>maxCount) {
				maxCount=count;
				mostRepeated=words[i];
			}
			
		}
		
		System.out.println("The most repeated word in string is: "+mostRepeated);
	}

}
