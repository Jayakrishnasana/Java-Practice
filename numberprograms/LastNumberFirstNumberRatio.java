package allprograms.numberprograms;

public class LastNumberFirstNumberRatio {

	public static void main(String[] args) {
		int n=1234567119;
		
		String s="";
		while(n!=0) {
			int r=n%10;
			s+=r;
			n/=10;
		}
		
		
		System.out.println("Reverse Number is : "+s);
		
		
		System.out.println(s.charAt(s.length()-1)+":"+s.charAt(0));
		
	}

}




