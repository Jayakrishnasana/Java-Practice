package allprograms.stringprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s="We promptly judged antique ivory buckles for the next prize";
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<26;i++) {
			if(s.indexOf((char)(i+97))==-1) {
				count++;
				break;
			}
		}
		if(count>0) System.out.println("This is Not Anagram");
		else System.out.println(" This is a Anagram");
//		System.out.println(res(s));

	}
	public static String res(String s) {
		String s1="abcdefghijklmnopqrstuvwxyz";
		char[] s2=s.toCharArray();
		Arrays.sort(s2);
		char[] s3=s1.toCharArray();
		boolean result=Arrays.equals(s2, s3);
		if(result) return "Anagram";
		return "Not Anagram";
		
	}

}
