package allprograms.patternprograms;

public class NumberPattern4 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	}

}

/*
     0 
    1 2 
   2 3 4 
  3 4 5 6 
 4 5 6 7 8 
5 6 7 8 9 10 

 */