package allprograms.stringprograms;

import java.util.Scanner;

public class CountWordsWOusingAnyStringInbuilt {
	public static void main(String[] args) {
		String s="I am java Developer";
		Scanner sc=new Scanner(s);
		int count=0;
		while(sc.hasNext()) {
			count++;
			sc.next();
		}
		System.out.println(count);
	}

}
