package allprograms.patternprograms;

public class StarPattern4 {
	public static void main(String[] args) {
		int n=5;
		int num=n;
		int str=n*2-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=str;j++) {
				if(i==1) {
					if(j<=str/2) System.out.print(num--);
					else System.out.print(num++);
				} 
				else {
					if(i==j||(j==str )) System.out.print(n);
					else System.out.print(" ");
				}
			}
			System.out.println();
			str-=1;
		}
	}

}
//543212345
// 5     5
//  5   5
//   5 5
//    5
