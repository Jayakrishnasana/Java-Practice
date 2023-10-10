package allprograms.numberprograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enetr Minim range of Number :" );
		int a=scn.nextInt();
		System.out.println("Enetr Maxim range of Number :" );
		int b=scn.nextInt();
		int min=0;
		int max=0;
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) {
			System.out.println(i);
			if(max<i) max=i;
			}
			
		}
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) {
				min=i;
			break;
			}
			
		}
		System.out.println("Maximun Prime Number is "+max);
		System.out.println("Minimum Prime Number is "+min);

	}
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

}
