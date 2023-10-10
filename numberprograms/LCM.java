package allprograms.numberprograms;

public class LCM {

	public static void main(String[] args) {
		// LCM of two Numbers
		int a=4;
		int b=6;
       int n=a>b?a:b;
       while(true) {
    	 if(n%a==0 && n%b==0)  break;;
    	
    	 n++;
       }
       System.out.println(n);

	}

}
