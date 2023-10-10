package allprograms.arrayprograms;

import java.util.Scanner;

public class Histogram1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number : ");
		int n=scn.nextInt();
		int t[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter "+i+" number : ");
			t[i]=scn.nextInt();
		}
//		for(int n1:t)
//		System.out.print(n1+" ");
		vertical(t);
	}
	
	public static void vertical(int t[]) {
		int n=t.length;
		int max=t[0];
		//find max number 
		for(int i=1;i<n;i++) {
			if(t[i]>max) max=t[i];
		}
		
		//print * according to input
		for(int j=max;j>=1;j--) {
			for(int k=0;k<n;k++) {
				if(t[k]>=j) System.out.print("|**| ");
				else System.out.print("     ");
			}
			System.out.println();
			
		}
		for(int n1:t) System.out.print(n1+"    ");
	}
	

}
