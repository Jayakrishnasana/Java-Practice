package allprograms.stringprograms;

public class SubStrings {
	public static void permutations(String s) {
	
		for(int i=0;i<s.length();i++) {
//			System.out.print(s.substring(i,i+1)+s.substring(i+1)+s.substring(0, i)+" ");
			String s1=s.substring(i,i+1)+s.substring(i+1)+s.substring(0, i);
			if(!Character.isDigit(s1.charAt(0))) {
				System.out.print(s1+" ");
			}
		}
	}
	public static void main(String[] args) {
		permutations("aB3");
	}

}
