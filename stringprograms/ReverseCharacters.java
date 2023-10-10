package allprograms.stringprograms;

import java.util.Scanner;

public class ReverseCharacters {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String :");
	    String s=scn.nextLine();
	    
	    System.out.println( reverseString(s));
	    

	}
   public static String reverseString(String s) {
	   char[] a=s.toCharArray();
	   int i=0;
	   int j=a.length-1;
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
