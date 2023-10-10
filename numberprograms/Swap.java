package allprograms.numberprograms;

public class Swap {

	public static void main(String[] args) {
		// Swap Two numbers without using 3rd variable
		
		int a=20;
		int b=30;
		System.out.println("Before Swap");
		System.out.println(a);
		System.out.println(b);

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap");
		System.out.println(a);
		System.out.println(b);

	}

}
