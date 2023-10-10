package allprograms.stringprograms;

public class count {
	public static void main(String[] args) {
		
		String s = "gveevksfvorvgeevksvvv";
		char ch = ' ';
		char c=' ';
		String s1 = "";
		int max = 0;

		int count = 0;

		while (s.length() != 0) {
			
			s1 = s.replace(s.charAt(0) + "", "");
			count = s.length() - s1.length();
		
			if (count > max) {
				max = count;
				c = s.charAt(0);
			}
			ch = s.charAt(0);
			System.out.println(ch + " = " + count);
			s = s1;
			ch=' ';
		}
		System.out.println("Maximum character "+ c+" with ocurences " + max+" times");
	}

}
