package allprograms.patternprograms;

import java.util.Iterator;

public class Traiangle01 {

	public static void main(String[] args) {
		int n=5;
		for( int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++){
				if(i+j==n+1 || i==j)
					System.out.print("* ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}

/*
 

* 2 3 4 * 
1 * 3 * 5 
1 2 * 4 5 
1 * 3 * 5 
* 2 3 4 * 


 */