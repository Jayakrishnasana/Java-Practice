package allprograms.patternprograms;

public class NumberPattern1 {
	public static void main(String[] args) {
		int n=5;
		int s=0;
		int v=1;
		for(int i=n;i>=0;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i%2!=0)
					System.out.print(v++);
				else
					System.out.print(--v);
			}
			System.out.println();
			
		}
	}

}
/*
 
 12345
 5432
  234
   43
    3
     
 
 */