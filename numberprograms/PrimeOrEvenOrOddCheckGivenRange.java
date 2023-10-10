package allprograms.numberprograms;

import java.util.Scanner;

public class PrimeOrEvenOrOddCheckGivenRange {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(isprime(i)){
				System.out.println(i+" is Prime");

			}
			else if(i%2!=0){
				System.out.println(i+" is odd");
			}
			else {
				System.out.println(i+" is even");
			}
		}
		
	}
	
	public static boolean isprime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) count++;
		}
		if(count==2) return true;
		return false;
	}

}
