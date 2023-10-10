package allprograms.numberprograms;

import java.util.Scanner;

public class FabbonocciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  range");
		int n=sc.nextInt();
		
		
		int[] numbers=new int[n];
		int a=0,b=1,c=0;
		
		for(int i=0;i<n;i++) {
			
//			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			numbers[i]=c;
		}
		System.out.println("______________");
		for(int s:numbers) {
			System.out.println(s);
		}
		
		

	}

}
