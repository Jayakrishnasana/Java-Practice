package allprograms.arrayprograms;

import java.util.Scanner;

public class AscendingDesecndingOrder {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter  range :");
		int Range=scn.nextInt();
		int[] a=new int[Range];
		System.out.println("Enter all "+Range+" numbers");
		for(int i=0;i<Range;i++) {
			System.out.print("enter "+(i+1)+" Number "+":");
			a[i]=scn.nextInt();
			
		}
		System.out.println();
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("\nIncreasing Order........");
		sort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("\nDecreasing Order........");
		Ascsort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("\nRepeating Order........");
		Repeatsort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}


	}
	static void sort(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {	
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			}
				
			}
			
		}
	}
	
static void Ascsort(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
			if(a[j]<a[j+1]) {	
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
			}
				
			}
			
		}
	}

static void Repeatsort(int[] a) {
	int shift=2;
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;j++) {
			while(shift!=0) {
				
				int temp=a[0];
				a[0]=a[a.length-1];
				a[a.length-1]=temp;
				
				
				
				shift--;
			}
			
		}
		
	}
}


}
