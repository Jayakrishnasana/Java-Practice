package allprograms.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AllIndexesInString {

	public static void main(String[] args) {
		
		String s="success";
		s=s.replace(" ", "");
		Map<Character, String> m=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(m.containsKey(c))
				m.put(c, m.get(c)+","+i);
			else
				m.put(c, i+"");
		}
		
		System.out.println(m);

		
		
	}
}
