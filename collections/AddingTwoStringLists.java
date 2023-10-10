package allprograms.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AddingTwoStringLists {
	public static void main(String[] args) {
		String[] s1= {"10","30","15","7","25"};
		String[] s2= {"20","15","8","9","17"};
		int[] n=new int[s1.length-1];
		for(int i=0;i<n.length;i++) {
			n[i]=Integer.parseInt(s1[i]);
		}
		sort1(n);
		int[] n1=new int[s2.length-1];
		for(int i=0;i<n1.length;i++) {
			n1[i]=Integer.parseInt(s2[i]);
		}
		sort1(n1);
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(n1));
		int[] n3=new int[n.length+n1.length];
		int k=0;
		for(int i=0;i<n.length;i++) {
			n3[k++]=n[i];
		}
		for(int i=0;i<n1.length;i++) {
			n3[k++]=n1[i];
		}
		
		sort1(n3);
		System.out.println(Arrays.toString(n3));
		
		
		Set<Integer> s=new TreeSet<>();
		for(int i=0;i<n3.length;i++) {
			s.add(n3[i]);
		}
		System.out.println(s);
		
	}
	
		
	public static void sort1(int[] a) {
		   for(int i=0;i<a.length-1;i++) {
			   for(int j=0;j<a.length-1;j++) {
				   if(a[j]>a[j+1]) {
					   int temp=a[j];
					   a[j]=a[j+1];
					   a[j+1]=temp;
				   }
			   }
		   }
	}
}
