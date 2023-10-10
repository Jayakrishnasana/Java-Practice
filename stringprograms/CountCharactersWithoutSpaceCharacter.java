package allprograms.stringprograms;

import java.util.Scanner;

public class CountCharactersWithoutSpaceCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s = sc.nextLine();
		
		char[] s1=s.toCharArray();
	  int i=0,j=s.length(),k=0;
	  while(i<j) {
	for( i=0;i<s1.length;i++) {
		if(s1[i]!=' ') k++;
		
	}
	System.out.println(k);
	
	j--;
	  }
		
	}

}
