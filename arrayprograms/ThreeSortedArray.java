package allprograms.arrayprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ThreeSortedArray {
	public static void main(String[] args) {
		int ar1[] = {2929,1, 5, 10, 20, 40,1, 80};
		int ar2[] = {2929,6, 7, 20, 80, 1,100};
		int ar3[] = {2929,3, 4, 15, 20, 30, 1,70, 80, 120};
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<ar1.length;i++) {
			for(int j=0;j<ar2.length;j++) {
				if(ar1[i]==ar2[j]) {
					for(int k=0;k<ar3.length;k++) {
						if(ar1[i]==ar3[k]) {
							list.add(ar1[i]);
						}
					}
					
				}
			}
		}
//		System.out.println(list);
		TreeSet<Integer> set = new TreeSet<>();
		set.addAll(list);
		System.out.println(set);
	}

}
//[1, 20, 80, 2929]