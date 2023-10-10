package allprograms.stringprograms;

import java.util.Scanner;

public class CovertEveryCharacterLowerCasetoUpperANSUpperToLowerCase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String :");
	    String s=scn.nextLine();
	    System.out.println(reverseChar(s));

	}
	
	
	static String reverseChar(String s) {
		char[] a=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
	      if(a[i]>='A' && a[i]<='Z') 
	    	  a[i]=(char)(a[i]+32);
	      
	      else if(a[i]>='a' && a[i]<='z') 
	    	  a[i]=(char)(a[i]-32);
		}
		return new String(a);
	}

}
