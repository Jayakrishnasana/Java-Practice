package allprograms.arrayprograms;

public class MajorityElement {
	public static void main(String[] args) {
		int A[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
		int len=A.length/2;
		int n=0;
		int num=0;
		
		for(int i=0;i<A.length;i++) {
			int count=0;
			for(int j=1;j<A.length;j++) {
				
				if(A[i]==A[j]) {
					count++;
				}
				
			}
			
//			System.out.println(A[i]+"   "+count);
			if(count>n) {
				n=count;
				num=A[i];
			}
			
		}
//		System.out.println(n);
		System.out.println(num+" with "+n+" times");
		
		
	}

}
