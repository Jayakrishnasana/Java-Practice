package allprograms.numberprograms;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enetr Minim range of Number :" );
		int a=scn.nextInt();
		System.out.println("Enetr Maxim range of Number :" );
		int b=scn.nextInt();
		int max=0;
		int min = 0;
		for(int i=a;i<b;i++) {
			if(isPerfect(i)) {
				System.out.println(i);
				if(max<=i) max=i;
			    
			}
			for(int j=a;j<b;j++) {
				if(isPerfect(j)) {
					min=j;
					break; 
				}
					   
				}		
		}
		System.out.println("Maximum Nuber is "+max);
		System.out.println("Minimum Nuber is "+min);
		

	}
	static boolean isPerfect(int n) {
		int num=n;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) sum+=i;
			
		}
		return sum==num;
		
	}

}
