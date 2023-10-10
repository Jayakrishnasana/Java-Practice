package allprograms.patternprograms;

public class NumberPattern3 {
	public static void main(String[] args) {
		int n=5;
		int a=1,b=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				if(i==1) {
					System.out.print(a++);
				}
				else if(j==n) System.out.print("1");
				else if(i==j) System.out.print(b--);
				
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}


/*
 12345
 1  4
  1 3
   12
    1

 */