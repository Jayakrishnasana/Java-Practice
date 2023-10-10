package allprograms.numberprograms;

public class SpecialNumbers {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6};
		int k=4,n=5;
		
	System.out.println(	array(a, n, k));
		

	}
	
	public static int array(int[] a,int n,int k) {
		int sum=0;
		int n1=1;
		while(k!=0) {
			int count=0;
			for(int i=0;i<n;i++) {
				if(n1%a[i]==0) count++;
			}
			if(count==0) {
				sum+=n1;
				n1++;
				k--;
			}
			else {
				n1++;
			}
		}
		return sum;
	
	}

}
