package allprograms.stringprograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TwoStringsAdd {
	public static void main(String[] args) {
		String[] s1= {"Hari","James","Rahul","Hari"};
		String[] s2= {"Farroq","Shyam","James"};
		Set<String> s3=new LinkedHashSet<>();
		for(int i=0;i<s1.length;i++) {
			s3.add(s1[i]);
		}
		for(int i=0;i<s2.length;i++) {
			s3.add(s2[i]);
		}
		System.out.println(s3);
	}

}
