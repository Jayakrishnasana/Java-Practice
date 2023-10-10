package allprograms.stringprograms;

import java.util.Scanner;

public class PermutationAllPossibleWordsRepetation

{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sring");
		String s = sc.next();
		permutation(s, 0, s.length()-1);

	}
	static void permutation(String s,int start,int end){
		if(start>=end) {
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++) {
			String s1=Swap(s,start,i);
			permutation(s1,start+1,end);
		}
		
	}
	static String Swap(String s,int i,int j) {
		char[] c=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
		return new String(c);
	}

}
/*o/p
 * 
 * abc acb bac bca cba cab
 */
