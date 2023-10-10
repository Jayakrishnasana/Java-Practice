package allprograms.stringprograms;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String s1="java is an oop lang";
		String[ ] a=s1.split(" ");
		String s2="";
		for(int i=a.length-1;i>=0;i--) {
			s2+=a[i];
			s2+=" ";
			
		}
		s2=s2.trim();
		System.out.println(s2);

	}

}
