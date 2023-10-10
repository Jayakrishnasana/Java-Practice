package allprograms.patternprograms;

import java.util.Scanner;
	

public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n1=sc.nextInt();
        int n=n1;
        
        // Upper half of the diamond
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
            	if(j==1) System.out.print(n--);
                if(i==j&&i!=1) System.out.print(n1); 
                else System.out.print(" ");
            }
            System.out.println();
        }
        ++n;
        // Lower half of the diamond
        for (int i = n1-1; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
            	if(j==1) System.out.print(++n);
                if(i==j&&i!=1) System.out.print(n1);
                
                
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}


//5
//4 5
//3  5
//2   5
//1    5
//2   5
//3  5
//4 5
//5




