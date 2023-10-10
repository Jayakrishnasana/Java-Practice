package allprograms.patternprograms;

public class PatternWithoutLoop {
	static void printPattern(int n) {
		int line=1;
		int currestar=0;
		for(line=1;line<=n;) {
			if(currestar<line) {
				System.out.print("* ");
				currestar++;
				
			}
			if(currestar==line) {
				System.out.println();
				line++;
				currestar=0;
			}
		}
		
	}
	public static void main(String[] args) {
		printPattern(5);
	}

}
