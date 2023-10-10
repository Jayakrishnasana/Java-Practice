package allprograms.numberprograms;

public class Palindrome {

	public static void main(String[] args) {
		//Palindrome in given range
		int m=1234554321;
		int n=m;
		int rev =0;
		while(n!=0) {
			int r=n%10;
			rev=r+rev*10;
			n/=10;
		}
		if(m==rev) System.out.println("Palindrome Number");
		else System.out.println(" Not Palindrome Number");
		

	}

}
