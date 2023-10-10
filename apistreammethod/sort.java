package allprograms.apistreammethod;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sort {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(3,4,2,1,3,5,3,0,7,9,5,0,7,1);
	List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
	System.out.println(list2);
	
	List<Integer> list3 = list.stream().sorted(Integer::compare).collect(Collectors.toList());
	System.out.println(list3);
	
	

	}

}
