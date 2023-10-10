package allprograms.regularexpression;

public class splitAndReplaceAll {

	public static void main(String[] args) {
		String s="a1b2c3";
		String s1=s.replaceAll("[0-9]", " ");
		System.out.println(s1);
		String[] s2=s.split("[a-z]");
		for(String a:s2) {
		System.out.println(a);
		}

	}

}
