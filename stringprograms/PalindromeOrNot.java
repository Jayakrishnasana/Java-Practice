package allprograms.stringprograms;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=scn.nextLine();
		System.out.println(ispalindrome(s));

	}
	public static boolean ispalindrome(String n) {
		n=n.toLowerCase();
		char[] s1=n.toCharArray();
		int i=0,j=s1.length-1;
		while(i<j) {
			if(s1[i] != s1[j]) return false;
			i++;
			j--;
		}
		return true;
		
	}

}
/*i/p
 * madam
 * 
 * o/p
 *  true
 */