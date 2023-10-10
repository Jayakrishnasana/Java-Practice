package allprograms.arrayprograms;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int k=2,x=0,y=0;
		int[] a2=new int[a.length];
		for(int i=k;i<a.length;i++) {
			a2[x]=a[i];
			x++;
		}
		for(int j=x;j<a.length;j++) {
			a2[j]=a[y];
			y++;
		}
		System.out.println(Arrays.toString(a2));
	}

}
/* [3, 4, 5, 6, 7, 1, 2] */