package allprograms.numberprograms;

public class XylemAndPhloem {

	public static void main(String[] args) {
		int n=12348;
		int n2=n;
		int n1=n;
		int sum=0;
		int sum1=0;
		int count=0;
		while(n1!=0) {
			n1/=10;
			count++;
		}
		
		for(int i=0;i<1;i++) {
			sum+=n2%10;
			n2/=10;
		}
		
		for(int i=0;i<count-2;i++) {
			sum1+=n2%10;
			n2/=10;
		}
		
		for(int i=0;i<n2;i++) {
			sum+=n2%10;
		}
		if(sum==sum1) System.out.println("This is Xylem Number");
		else System.out.println("This is Phloem Number");

	}

}


//This is Xylem Number

/*
 * A number N will be a xylem number if the sum of its extreme (first and last)
 * digits is equal to the sum of mean (all digits except first and last) digits.
 * If the sum of extreme digits is not equal to the sum of mean digits, the
 * number is called phloem number.
 * 
 */