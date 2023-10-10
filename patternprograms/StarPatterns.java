package allprograms.patternprograms;

public class StarPatterns {
	public static void main(String[] args) {
		int n=10;
		int spaces=n/2,stars=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		/*
		 *
*
**
***
****
*****
******
*******
********
*********
**********
		                            
		 *                            */
		System.out.println("___________");
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		/*
		
		
		**********
		*********
		********
		*******
		******
		*****
		****
		***
		**
		*
		   */
		System.out.println("___________");
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/*
 * * * * * * * * * * 
  * * * * * * * * * 
   * * * * * * * * 
    * * * * * * * 
     * * * * * * 
      * * * * * 
       * * * * 
        * * * 
         * * 
          * 
        
		 */
		        
		System.out.println("___________");
		
		for(int i=n;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
			
			
/*
		  * 
         * * 
        * * * 
       * * * * 
      * * * * * 
     * * * * * * 
    * * * * * * * 
   * * * * * * * * 
  * * * * * * * * * 
 * * * * * * * * * *  

*/
		
		
		System.out.println("___________");
		
		
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++) {
				if(j==stars||j==1||i==n/2 ||j==stars/2+1)
					System.out.print("*");
				else System.out.print(" ");
			}
			
			System.out.println();
			if(i<n/2) {
				spaces--;
				stars+=2;
			
			}
			else {
				spaces++;
				stars-=2;
			}
		}
		
	}
	
	
/*
     *
    ***
   * * *
  *  *  *
 *   *   *
***********
 *   *   *
  *  *  *
   * * *
    ***
     *
*/
}
