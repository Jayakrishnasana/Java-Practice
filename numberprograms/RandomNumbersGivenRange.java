package allprograms.numberprograms;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersGivenRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=scn.nextInt();
		System.out.println("Enter start number :");
		int start=scn.nextInt();
		System.out.println("Enter end Number :");
		int end=scn.nextInt();
		Random random = new Random();
		System.out.println("The "+n+" Random numbers are in range "+start+"-"+end+" :");
		random.ints(start,end).limit(n).forEach(System.out::println);
		

	}

}
