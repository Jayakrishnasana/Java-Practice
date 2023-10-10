package allprograms.stringprograms;

import java.util.Arrays;

public class LargestWordInString {
	public static void main(String[] args) {
		String s="jaya is very zasy java jara ";
		char[] c = s.toCharArray();
		String s1="";
		String max="";
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				s1+=c[i];	
			}
			else {
				if(s1.length()>max.length()) max=s1;
				 if (s1.length()==max.length()) {
					if(max.compareTo(s1)>0) {
						String t=s1;
						s1=max;
						max=t;
						
					}
				}
				
				s1="";
				
			}
		}
		if(s1.length()>max.length() ) max=s1;
		if (s1.length()==max.length()) {
			if(max.compareTo(s1)>0) {
				String t=s1;
				s1=max;
				max=t;
				
			}
		}
		System.out.println(max);
		
		
	}
	
	
	
}
