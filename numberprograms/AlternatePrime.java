package allprograms.numberprograms;

public class AlternatePrime {
	public static void main(String[] args) {
		int n=20,c=0;
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				if(c%2==0) System.out.print(i+"  ");
				c++;
				
			}
		}
		
		
	}
	
	public static boolean isPrime(int n) {
		boolean flag=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(flag==false) return true;
		return false;
	}
}
