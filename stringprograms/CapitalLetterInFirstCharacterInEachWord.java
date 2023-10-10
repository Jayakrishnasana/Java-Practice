package allprograms.stringprograms;

public class CapitalLetterInFirstCharacterInEachWord {

	public static void main(String[] args) {
		String s="java is a very easy gj gjv gby g u f";
		char[] s1=s.toCharArray();
		boolean space=true;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s1[i])) {
				if(space) {
					s1[i]=Character.toUpperCase(s1[i]);
					space=false;
				}
			}
			else {
				space=true;
			}
		}
		s=String.valueOf(s1);
		System.out.println(s);

	}

}


//Java Is A Very Easy Gj Gjv Gby G U F