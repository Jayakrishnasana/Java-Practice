package allprograms.stringprograms;

import java.util.Scanner;

public class NexAlphabetCharacter {


	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter charcter :");
		char ch=scn.next().charAt(0);
		if(ch=='z' || ch=='Z') System.out.println((char)(ch-25));
		else System.out.println((char)(ch+1));
	
		

	}

}
