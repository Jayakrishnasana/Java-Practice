package allprograms.stringprograms;

import java.util.HashMap;
//Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.
//For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.

public class IsomorphicStrings {
	public static void main(String[] args) {
		String s1="foo";
		String s2="bar";
		System.out.println(isIsomorphic(s1, s2));
		
	}
	public static boolean isIsomorphic(String s,String t) {
		if(s.length()!=t.length()) return false;
		HashMap<Character, Character> hm = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				if(!hm.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}
			}
			else {
				if(hm.containsValue(t.charAt(i))) {
					return false;
				}
				hm.put(s.charAt(i), t.charAt(i));
				 
			}
		}
		return true;
	}

}
