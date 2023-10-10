package allprograms.patternprograms;

public class Traingle02 {
	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0)
					System.out.print("1");
				else
					System.out.print("0");
				
			}
			System.out.println();
		}
	}

}


/*


1	1
01
101
0101
10101
010101
1010101
01010101
101010101
0101010101

 */