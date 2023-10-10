package allprograms.collections;

import java.util.ArrayList;
import java.util.List;

public class AddingTwoLists {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		list1.add(5);
		list1.add(6);
		list1.add(8);
		list1.add(3);
		list1.add(10);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(2);
		list2.add(8);
		list2.add(3);
		list2.add(1);
		list2.add(9);
		String s1="";
		String s2="";
		for(int i=0;i<list1.size();i++) {
			s1+=list1.get(i);
		}
		for(int i=0;i<list2.size();i++) {
			s2+=list2.get(i);
		}
		System.out.println(list1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(list2);
		int n=Integer.parseInt(s1);
		int n1=Integer.parseInt(s2);
		int sum=n+n1;
		String s3=String.valueOf(sum);
		System.out.println(sum);
		List<Integer> list3=new ArrayList<>();
		for(int i=0;i<s3.length();i++) {
			list3.add(sum%10);
			sum/=10;
		}
		System.out.println(list3);
		
		
	}
}
