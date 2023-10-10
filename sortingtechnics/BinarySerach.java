package allprograms.sortingtechnics;

public class BinarySerach {

	public static void main(String[] args) {
		int[] a= {3,4,5,6,7,8,9,10};
		System.out.println(search(a,9));
		System.out.println(search(a,14));
		System.out.println(search(a,7));

	}
	static int search(int[] a,int e) {
		int first=0,last=a.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(e==a[mid]) return mid;
			else if(e<a[mid]) return last=mid-1;
			else first=mid+1;
		}
		return -1;
	}
	

}
