package allprograms.apistreammethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,2,4,5,3,2,1,4,5,6,7,8,9);
		
		
		Set<Integer> set=new HashSet<>();
		Set<Integer> collect = list.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
		System.out.println("Duplicate  values are : "+collect);
		
		
		Set<Integer> set1=new HashSet<>();
		Set<Integer> collect2 = list.stream().filter(s->set1.add(s)).collect(Collectors.toSet());
		System.out.println("Unique values are : "+collect2);
	}

}
