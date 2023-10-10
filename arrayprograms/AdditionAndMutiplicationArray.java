package allprograms.arrayprograms;

public class AdditionAndMutiplicationArray {

	public static void main(String[] args) {
		int[] a= {10,2,3,1};
		int sum=0;
		for(int n:a) {
			sum+=n;
		}
    System.out.println(sum);
    multi(a);
	}
	
	
	public static void multi(int[] a) {
		int mul=1;
		for(int n:a) {
			mul*=n;
		
		}
		System.out.println(mul);
	}

}
