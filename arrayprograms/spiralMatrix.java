package allprograms.arrayprograms;

public class spiralMatrix {

	public static void main(String[] args) {
		int[][] a=spiral(5);
		for(int[] n:a) {
			for(int m:n) {
				System.out.print(m+"\t");
			}
			System.out.println();
		}

	}
	static int[][] spiral(int s){
		
		int[][] a=new int[s][s];
		int minrow=0;
		int mincol=0;
		int maxrow=s-1;
		int maxcol=s-1;
		int value=1;
		
		while(value<=s*s) {
			for(int i=minrow;i<=maxcol;i++) {
				a[minrow][i]=value;
				value++;
			}
			for(int i=mincol+1;i<=maxrow;i++) {
				a[i][maxcol]=value;
				value++;
			}
			for(int i=maxcol-1;i>=mincol;i--) {
				a[maxrow][i]=value;
				value++;
			}
			for(int i=maxrow-1;i>minrow;i--) {
				a[i][mincol]=value;
				value++;
			}
			
			
			mincol++;
			minrow++;
			maxcol--;
			maxrow--;
			
			
			
		}
		return a;
	}

}


/*
 o/p
 
 1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9	

 */

