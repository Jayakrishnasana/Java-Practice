package allprograms.collections;


import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesArray {
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		Set<Integer> s=new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			s.add(arr[i]);
		}
		System.out.println(s);
	}

}
