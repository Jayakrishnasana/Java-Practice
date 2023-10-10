package allprograms.arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArray {
	public static void main(String[] args) {
		int arr1[] = {1, 5, 2, 3, 6,3};
		int arr2[] = {3, 8, 6, 20, 7,3};
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					list.add(arr1[i]);
				}
			}
		}
		System.out.println(list);
	}

}
