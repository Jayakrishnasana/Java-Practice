package allprograms.stringprograms;

public class StringToNumber {
	public static void main(String[] args) {
		String s="a123b456c789d";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				s1+=c;
			}
		}
		System.out.println(s1);
	}

}
