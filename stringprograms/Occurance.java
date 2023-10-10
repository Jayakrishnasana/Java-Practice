package allprograms.stringprograms;

import java.util.HashMap;
import java.util.TreeMap;

public class Occurance {

	public static void main(String[] args) {
		String s = "aafffavvvvvvvvvvvvvvvvafag";
		System.out.println("hello world");
		TreeMap<Integer, Character> tm = new TreeMap<>();
		String s1 = "";
		int count = 0;
		while (s.length() != 0) 
		{
			s1 = s.replace(s.charAt(0) + "", "");
			count = s.length() - s1.length();
			tm.put(count, s.charAt(0));
			s= s1;
		}
		
		System.out.println(tm);

	}

}
