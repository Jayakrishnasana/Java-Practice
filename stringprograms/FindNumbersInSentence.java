package allprograms.stringprograms;

import java.util.Scanner;

public class FindNumbersInSentence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a String :");
	    String s=scn.nextLine().toLowerCase();
	    String num="";
	    for(int i=0;i<s.length();i++) {
	    	char c=s.charAt(i);
	    	if(c>='0' && c<='9')
	    		num+=c;
	    }
	    System.out.println(num);

	}

}
/*i/p
 * All2 Numbers3 6hg7 y68
 * 
 *  o/p
 *  236768
 */