package allprograms.arrayprograms;

import java.util.Scanner;

public class FibonocciNumbersWithShapeArray {

	
	
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
        System.out.println("Enetr a range :");
        int num=scn.nextInt();
        int[] n=new int[num];        
        int a=0,b=1,c;
        for(int i=0;i<num;i++) {
        	c=a+b;
        	a=b;
        	b=c;
        	n[i]=c;
        	
        	
        	
        }
	    for(int s:n) {
	    	System.out.print(s+" ");
	    }
		
       System.out.println("---------------\n");
		for(int i=0;i<n.length;i++) {
			if(i%2==0) {
				for(int j=0;j<n.length;j++) {
					if(i==j) {
						System.out.print(n[i]);
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
			
		}
		
		for(int i=n.length-1;i>0;i--) {
			if(i%2!=0) {
				for(int j=n.length;j>0;j--) {
					if(i+j==n.length+1) {
						System.out.print(n[i]);
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			
			
		}
		


	}

}


/*i/p
 * 5 
 * 
 * o/p
 * 1 2 3 5 8 ---------------
 * 
 *1
 *	3
 *		8
 *	5
 *2
 */

