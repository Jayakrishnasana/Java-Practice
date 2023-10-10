package allprograms.numberprograms;

public class Happy {
	public static int isHappy(int n) {
		int rem = 0;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum += (rem * rem);
			n /= 10;
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int n = 13;
		int m = n;
		while (m != 1 &&m != 4) {
			m = isHappy(m);
		}
		if (m == 1)
			System.out.println("Happy");
		else
			System.out.println("UnHappy");
	}

}
