package allprograms.arrayprograms;

public class SecondBigAndSmallNumber {

	public static void main(String[] args) {
		int[] a= {4,6,2,7,8,5,3};
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<s1) {
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2 || s1==s2) {
				s2=a[i];
			}
		}
       System.out.println("Second Small Number is: "+s2);
       secondBig(a);
	}
     static void secondBig(int[] a) {
    	 int s1=a[0];
    	 int s2=a[0];
    	 for(int i=1;i<a.length;i++) {
    		 if(a[i]>s1) {
    			 s2=s1;
    			 s1=a[i];
    		 }
    		 else if(a[i]>s2) {
    			 s2=a[i];
    		 }
    	 }
    	 System.out.println("Second Biggest Number is: "+s2);
     }
     
  
     
}
