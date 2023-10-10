package allprograms.numberprograms;

import java.util.Scanner;

public class PrimeNumbersAndSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int n1=n;
		int sum=0;
		String t="";
		
		while(n1!=0) {
			int rem=n1%10;
			n1/=10;
			if(rem==2 ||rem==3 ||rem==5 ||rem==7) {
				sum+=rem;
				t+=rem+"";
			}
		}
		System.out.println(rev(t)+":"+sum);
		
		
		
	}
	public static String rev(String s) {
		char[] a=s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}
	
}

/*i/p
 * 1234561179 
 * o/p
 * 2357:17
 */
