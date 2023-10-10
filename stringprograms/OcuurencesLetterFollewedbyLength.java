package allprograms.stringprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OcuurencesLetterFollewedbyLength {

	public static void main(String[] args) {
		String s="abbbcccddddd";
		HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else {
				hashMap.put(ch, 1);
			}
		}
		System.out.println(hashMap);
		String s2="";
		for(Entry<Character, Integer> s3:hashMap.entrySet()) {
			if(s3.getValue()!=1) s2+=s3.getKey()+""+s3.getValue();
			else s2+=s3.getKey();
		}
		System.out.println(s2);

	}

}
