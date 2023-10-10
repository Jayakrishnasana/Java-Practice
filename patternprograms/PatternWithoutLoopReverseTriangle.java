package allprograms.patternprograms;

public class PatternWithoutLoopReverseTriangle {
	public static void main(String[] args) {
		int star=0;
		for(int i=5;i>=0;) {
			if(i>star) {
				System.out.print("*");
				star++;
			}
			if(star==i) {
				
				System.out.println();
				star=0;
				i--;
			}
			
		}
	}
}
