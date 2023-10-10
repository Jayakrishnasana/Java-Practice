package allprograms.arrayprograms;

public class BiggestAndSmallestElementIn2DArray {
	public static void main(String[] args) {
		int[][] n= {{2,3,4},{56,3,6},{27,800,100}};
		int big=n[0][0],small=n[0][0];
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(n[i][j]>big) {
					big=n[i][j];
				}
				if(n[i][j]<small) {
					small=n[i][j];
				}
			}
		}
		System.out.println("Biggest Number is : "+big);
		System.out.println("Smallest Number is : "+small);
	}

}
