package allprograms.arrayprograms;

public class SpiralMatrixusingForloop {

	public static void main(String[] args) {
		int[][]a=spiral(5);
		for(int n[]:a) {
			for(int t:n) {
			     System.out.print(t+"\t");
			}
		   System.out.println();
		}
		

	}
   public static int[][] spiral(int s){
	   int[][] a=new int[s][s];
	   int mincol=0;
	   int maxcol=s-1;
	   int minrow=0;
	   int maxrow=s-1;
	   int value=1;
	   
	   while(value<=s*s) {
		   for(int i=minrow;i<maxrow;i++) {
			   a[minrow][i]=value;
			   value++;
		   }
		   for(int i=minrow;i<=maxrow;i++) {
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
