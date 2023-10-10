package allprograms.stringprograms;

public class lengthInBetweenWord {
	public static void main(String[] args) {
		String s="i am in Bangalore";
		char[] c = s.toCharArray();
		String s1="";
		char[] c1 = s1.toCharArray();
		String s2="";
		for(int i=0;i<c.length;i++) {
			char ch=c[i];
			if(ch!=' ') {
				s1+=ch;
			}
			else if(s1.length()!=0) {
				
				int count=0;
				for(int j=0;j<s1.length();j++) {
					count++;
				}
				s2+=s1.substring(0, s1.length()/2)+count+s1.substring(s1.length()/2,s1.length());
				s1="";
				s2+=" ";
				
				
			}
		}
		int count=0;
		for(int j=0;j<s1.length();j++) {
			count++;
		}
		s2+=s1.substring(0, s1.length()/2)+count+s1.substring(s1.length()/2,s1.length());
		System.out.println(s2);
	}

}
