package allprograms.patternprograms;

public class NumberPattern2 {
	public static void main(String[] args) {
		int n=5;
		int sp=0;
		int x=1,y=0;
		int str=n;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=sp;j++) System.out.print(" ");
			if(i%2!=0) {
				for(int j=1;j<=str;j++) {
					y=x;
					System.out.print(x);
					x++;
				}
			}
			else {
				for(int k=1;k<=str;k++) {
					x=y;
					System.out.print(y);
					y--;
				}
			}
			System.out.println();
			str--;
			sp++;
			
		}
		
		
	}

}
/*
 
 
 12345
 5432
  234
   43
    3

 
 
 */
