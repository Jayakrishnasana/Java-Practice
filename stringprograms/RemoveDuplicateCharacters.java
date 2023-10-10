package allprograms.stringprograms;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String :");
	    String s=scn.nextLine();
	    
	    String s2="";
	    
	    for(int i=0;i<s.length();i++) {
	    	char c=s.charAt(i);
	    	if(s2.indexOf(c)==-1)
	    		s2+=c;
	    }
     System.out.println(s2);
	}

}
/*i/p
 * aaa abbb aa a bbb 
 * 
 * o/p
 * a b
 */