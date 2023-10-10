package allprograms.patternprograms;

public class HallowPyramid {
	public static void main(String[] args) {
		int n=5;
		int star=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				if(k==1||k==star||i==n) System.out.print("* ");
				else System.out.print("  ");
			}
			star++;
			System.out.println();
		}
	}

}

/**
    * 
   * * 
  *   * 
 *     * 
* * * * * 

 */