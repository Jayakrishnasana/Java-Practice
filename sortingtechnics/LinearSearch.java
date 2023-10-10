package allprograms.sortingtechnics;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {4,5,7,4,5,7,6,4};
		System.out.println(search(a,7));
		System.out.println(search(a,9));
	}
	static int search(int[] a,int e) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) return i;
		}
		return -1;
	}

}
