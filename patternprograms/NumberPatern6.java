package allprograms.patternprograms;

public class NumberPatern6 {
	public static void main(String[] args) {
		int n=5;
		int str=n*2-1;
		int sp=0;
		for(int i=1;i<=n;i++) {
			int num=5;
			for(int j=1;j<=sp;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++) {
				if(k<=str/2) {
					System.out.print(num);
					num--;
				}else {
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
			str-=2;
			sp++;
		}
	}

}

//543212345
// 5432345
//  54345
//   545
//    5

