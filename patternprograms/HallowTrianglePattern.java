package allprograms.patternprograms;

public class HallowTrianglePattern {
	public static void main(String[] args) {
		int n=5,sp=n-1,str=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++) {
				if(k==1||k==str||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			sp--;
			str+=2;
		}
	
	}

}


/*
 
    *
   * *
  *   *
 *     *
*********

 
 
 */