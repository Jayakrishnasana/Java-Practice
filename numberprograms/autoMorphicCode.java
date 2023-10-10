package allprograms.numberprograms;

public class autoMorphicCode {

	public static void main(String[] args) {
		int n=25;
		int n1=n;
		int m=n*n;
		System.out.println(m);
		int count=0;
		int rev=0;
		while(n1!=0) {
			n1/=10;
			count++;
		}
		System.out.println(count);
		while(count!=0) {
			int r=m%10;
			System.out.println(r);
			count--;
			
		}
		
		
		if(m%10 == n) {
			System.out.println(n+ " is a morphic number");
		}
		else {
		System.out.println(n+ " is Not  morphic number");
		}
	}
	
}
