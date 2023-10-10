package allprograms.stringprograms;

import java.util.Scanner;

public class CheckPalindromeWOusingAnyStringInbuilt {
	
	public static void main(String[] args) {
		String s="Malayalam".toLowerCase();
		Scanner sc=new Scanner(s);
		sc.useDelimiter("");
		String s1="";
		while(sc.hasNext()) {
			s1=sc.next()+s1;
		}
		if(s1.equals(s)) System.out.println(s+"   is Palindrome");
		else System.out.println(s+"   is Not Palindrome");
		
	}

}
