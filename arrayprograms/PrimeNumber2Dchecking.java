package allprograms.arrayprograms;

import java.util.Arrays;

public class PrimeNumber2Dchecking {
	static boolean isPrime(int n) {
		int m=n;
		int count=0;
		if(m==1) return true;
		for(int i=2;i<m;i++) {
			if(m%i==0) count++;
		}
		if(count==0) return true ;
		return false;
	}
	
	public static void main(String[] args) {
		int[][] n= {{7,24,25},{35,40,18},{1,53,92}};
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(isPrime(n[i][j])) n[i][j]=n[i][j];
				else {
					for(int k=n[i][j];k>0;k--) {
						if(isPrime(k)) {
							n[i][j]=k;
							break;
						}
					}
					
				}
			}
		}
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				System.out.print(n[i][j]+"\t");
			}
			System.out.println();
		}
	}
}


/*If it is a prime number print it else print privious prime of the number in array*/