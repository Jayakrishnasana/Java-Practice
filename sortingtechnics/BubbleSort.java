package allprograms.sortingtechnics;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {4,5,7,4,5,7,6,4};
		sort(a);
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("--------------------");
		sort1(a);
		for(int n1:a) {
			System.out.print(n1+" ");
		}

	}
	static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	
	static void sort1(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
