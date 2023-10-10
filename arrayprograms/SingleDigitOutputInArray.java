package allprograms.arrayprograms;

import java.util.Arrays;

public class SingleDigitOutputInArray {
	public static int sum(int n) {
{
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
			
		}
		return sum;
	}
	}

public static void main(String[]args) {
	int []a= {33,53,52,81,90,1000080001};
	for(int i=0; i<a.length;i++) {
		while(a[i]>9) a[i]=sum(a[i]);
		
	}
	System.out.println(Arrays.toString(a));
}
}
