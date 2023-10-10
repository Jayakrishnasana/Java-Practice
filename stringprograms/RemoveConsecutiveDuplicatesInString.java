package allprograms.stringprograms;

public class RemoveConsecutiveDuplicatesInString {
	public static void main(String[] args) {
		String s="aabbbbbccbaa";
		System.out.println(remove(s));
	}
	public static String remove(String s) {
		char ch=s.charAt(0);
		String s1="";
		s1+=ch;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==ch) {}
			else {
				s1+=s.charAt(i);
			}
			ch=s.charAt(i);
		}
		return s1;
	}

}
