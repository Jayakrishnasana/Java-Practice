package allprograms.stringprograms;

public class ReverseStringBasedOnLengthWOinbuilt {
	public static void main(String[] args) {
		String s="I am in Bangalore";
		String s1="";
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			if(c[i]!=' ')
				s1+=c[i];
		}
		System.out.println(s1);
		
		char[] c1= s1.toCharArray();
		
		String s2="";
		String s3="";
		int k=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				s2+=c[i];
			}
			else if(s2.length()!=0) {
				int n=s2.length();
				while(n!=0) {
					s3+=c1[k++];
					n--;
				}
				s3+=" ";
				s2="";
			}
		}
		if(s2.length()!=0) {
			int n=s2.length();
			while(n!=0) {
				s3+=c1[k++];
				n--;
			}
			s3+=" ";
			s2="";
		}
		System.out.println(s3);
		}

}
