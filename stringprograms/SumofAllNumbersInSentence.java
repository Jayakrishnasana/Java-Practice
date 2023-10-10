package allprograms.stringprograms;

import java.util.Scanner;

public class SumofAllNumbersInSentence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String :");
	    String s=scn.next().toLowerCase();
	    
	    int sum=0;
	    for(int i=0;i<s.length();i++) {
	    	char c=s.charAt(i);
	    	if(c>='0' && c<='9') {
//	    		System.out.println(c);
	    		int n=c-'0';
	    		sum+=n;
	    		
	    	}
	    		
	    }
    System.out.println(sum);
	}

}
