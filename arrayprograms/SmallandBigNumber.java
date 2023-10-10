package allprograms.arrayprograms;

public class SmallandBigNumber {

	public static void main(String[] args) {
		int[] a= {7,4,5,7,20,4,5};
		int s=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<s) s=a[i];
		
		}
		System.out.println("small number is : "+s);
		big(a);
	}
	
	public static void big(int[] a) {
		int s=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>s) s=a[i];
		}
		System.out.println("big number is : "+s);
	}

}
