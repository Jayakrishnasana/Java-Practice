package allprograms.stringprograms;

import java.util.Scanner;

public class CountEachCharacterOccurence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String :");
	    String s=scn.nextLine();
       
	    while(s.length()>0) {
	    	char c=s.charAt(0);
	    	
	    	String s2=s.replace(c+"","");
	    	int count=s.length()-s2.length();
	    	System.out.println(c+" presents "+count+" times....");
	    	s=s2;
	    }  
	
	}

}
