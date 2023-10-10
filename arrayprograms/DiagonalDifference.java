package allprograms.arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		int[][] num={{10,2,3},{4,5,6},{7,8,9}};
		System.out.println(diagonalDifference(num));
	
	
		
	
}
	public static int diagonalDifference(int[][] num) {
	       
        int Lsum=0,Rsum=0;
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num.length;j++){
            if(i==j) {
                Lsum+=num[i][j];
            }
            if(i+j==num.length-1) {
                Rsum+=num[i][j];
            }
            
        }
        
    }
    return Math.abs(Lsum-Rsum);
    }

}
