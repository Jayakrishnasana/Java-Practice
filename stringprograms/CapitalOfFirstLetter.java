package allprograms.stringprograms;

public class CapitalOfFirstLetter {

	public static void main(String[] args) {
		String s= "my name is jAya kRishnA";
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i==0 || c[i]!=' '&&c[i-1]==' ' ) {
				if(c[i]>=97 &&c[i]<=122) {
					c[i]=(char)(c[i]-32);
				}		
			}
			else if(c[i]>=65 &&c[i]<=90) {
				c[i]=(char)(c[i]+32);
			}		
		}
		s=new String(c);
		System.out.println(s);

	}

}
