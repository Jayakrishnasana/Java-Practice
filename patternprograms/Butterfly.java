package allprograms.patternprograms;

public class Butterfly {

	public static void main(String[] args) {
		int n=4;
		//Upper half
		
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");    //print 1st stars
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");    //print spaces
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");   // print 2nd stars
			}
			
			System.out.println();
		}
		
		//Lower half
		
		
		for (int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}


/*
 
 
 *      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 
 
 */
