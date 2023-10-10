package allprograms.numberprograms;

import java.util.Scanner;

public class PalindromeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enetr Minim range of Number :" );
		int a=scn.nextInt();
		System.out.println("Enetr Maxim range of Number :" );
		int b=scn.nextInt();
		
		for(int i=a;i<=b;i++) {
			if(isPallindrome(i))
				System.out.println(i);
		}

	}
	static boolean isPallindrome(int n) {
		int n1=n;
		int rev=0;
		while(n1!=0) {
			int r=n1%10;
			rev=r+rev*10;
			n1/=10;
		}
		if(rev==n) return true;
		return false;
	}

}
