package allprograms.stringprograms;

public class ReverseEverywordInSameplaceInSentence {

	public static void main(String[] args) {
		String s1="java is a very easy language";
		char[] c=s1.toCharArray();
		String s2="";
		int len=s1.length();
		 int i=0,j=0;
		while(j<len) {
			while(j<len&&c[j]!=' ') j++;	
			
		
		String temp="";
		int k=j-1;
		while(k>=i) {
			temp+=c[k];
			k--;
		}
		s2+=temp;
		if(j<len) s2+=" ";
		j++;
		i=j;
		
		

	}
		
		System.out.println(s2);
	}

}
