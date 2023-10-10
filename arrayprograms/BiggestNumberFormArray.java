package allprograms.arrayprograms;

import java.util.Arrays;


public class BiggestNumberFormArray {
	public static String biggestNumber(int[] nums) {
		int n=nums.length;
		String[] s=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=String.valueOf(nums[i]);
		}
		Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
		StringBuilder sb=new StringBuilder();
		for(String str:s) {
			sb.append(str);
		}
		
		String result=sb.toString();
		return result.startsWith("0")?"0":result;
	}
	
	
	
	public static void main(String[] args) {
		int[] n= {54,546,548,10};
		System.out.println(biggestNumber(n));
	}
}
