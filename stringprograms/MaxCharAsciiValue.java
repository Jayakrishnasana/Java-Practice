package allprograms.stringprograms;

public class MaxCharAsciiValue {
	public static void main(String[] args) {
		String s="banana";
		String s2=s;
		String s1="";
		int max=0;
		char c=' ';
		while(s2.length()>0) {
			char ch=s2.charAt(0);
			s1=s2.replace(ch+"","");
			int count=s2.length()-s1.length();
			if(count>max) {
				max=count;
				c=s2.charAt(0);
			}
			s2=s1;
			
		}
		System.out.println("Most repeated Character : "+c);
		int a=(int)c;
		s1=s.replace(c+"",""+a);
		System.out.println(s1);
	}

}
