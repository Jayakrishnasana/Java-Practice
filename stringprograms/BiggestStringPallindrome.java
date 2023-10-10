package allprograms.stringprograms;

import java.util.Scanner;

public class BiggestStringPallindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String :");
	    String s=scn.next().toLowerCase();
	    
	    String bigString="";
	    for(int i=0;i<s.length();i++) {
	    	for(int j=i+1;j<s.length();j++) {
	    		if(bigPallindrome(s,i,j)) {
	    			String temp=s.substring(i,j+1);
	    			
	    			if(temp.length()>bigString.length())
	    				bigString=temp;
	    				
	    				
	    		}
	    	   
	    	}
	    }
	    System.out.println(bigString);
		}

	
	public static boolean bigPallindrome(String s,int start,int end) {
		int i=start;
		int j=end;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

}

