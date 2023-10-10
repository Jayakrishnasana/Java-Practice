package allprograms.stringprograms;

public class CountNoOfWordsInSentence {

	public static void main(String[] args) {
		String s="i am j7gu 7 f fb8v bff hfbn hbvf. g.g gvg ..vg  79v79 vhfg frv76 vfr$hjb ";
		String[] c=s.split(" ");
		int count=0;
		for(int i=0;i<c.length;i++) {

			String s2=c[i];
			boolean flag=isvalid(s2);
			if(flag==true) {
				System.out.print(s2+"  ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println(count);

	}
	
	static boolean isvalid(String word) {
		if(word.length()==0) return false;
		int len=word.length();
		for(int i=0;i<len;i++) {
			if((word.charAt(i)>='a' && word.charAt(i)<='z') ||
					(word.charAt(i)>='A' && word.charAt(i)<='Z') ||
					word.charAt(i)=='!' || word.charAt(i)=='-' || word.charAt(i)=='?'
					|| word.charAt(i)=='.')
			{
				continue;
			}
			else {
				return false;
			}
			
		}
		return true;
	}

}
