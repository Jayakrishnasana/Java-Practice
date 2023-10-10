import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		boolean com=false;
		int trail=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter min Number  :");
		int x=scn.nextInt();
		System.out.println("Enter max Number  :");
		int y=scn.nextInt();
		if(x>=y) System.out.println("max number must be  greater than min number");
		else {
			int n=(int) Math.round(x+Math.random()*(y-x));
//			System.out.println(n);
			System.out.println("Random Number Generated...Between "+x+" and "+y);
			System.out.println("Guess a Number..!!");
			while(!com ) {
				trail++;
				int g=scn.nextInt();
				if(n==g) {
					System.out.println();
					System.out.println("WoW..! You've got it.");
					System.out.println("-------------------");
					System.out.println("You used "+trail +" Attempts");
					System.out.println();
					com=true;
				}
				else if(n>g) {
					System.out.print("Your Guess is too small...try again \t:");
				}
				else if(n<g) {
					System.out.print("Your Guess is too big...try again \t:");
				}
				 if(trail>3) {
					 System.out.println();
					System.out.println("very sorry ..You used more than 3 attemps !!please try agin later");
					System.out.println("Thank You!!!");
					com=true;
				}
			}
		}
	}

}
