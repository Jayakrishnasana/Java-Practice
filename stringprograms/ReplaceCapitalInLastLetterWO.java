package allprograms.stringprograms;

public class ReplaceCapitalInLastLetterWO {
	public static void main(String[] args) {
		String s="I am in Bangalore";
		String s1="";
		String s2="";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				s1+=c[i];
			}
			else {
				String n=rev(s1);
				s2+=n.substring(0, n.length()-1)+n.substring(n.length()-1).toUpperCase();
				s1="";
				s2+=" ";
				
			}
		}
		String n=rev(s1);
		s2+=n.substring(0, n.length()-1)+n.substring(n.length()-1).toUpperCase();
		
		System.out.println(s2);
	}
	public static String rev(String s) {
		char[] c = s.toCharArray();
		String s1="";
		for(int i=c.length-1;i>=0;i--) {
			s1+=c[i];
		}
		return s1;
	}

}
