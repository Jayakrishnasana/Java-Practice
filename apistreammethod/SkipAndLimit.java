package allprograms.apistreammethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipAndLimit {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,5,6,7,4,6,4,2,2);
		
		System.out.println("Normal List : "+list);
		List<Integer> limit = list.stream().limit(3).collect(Collectors.toList());
		System.out.println("limit() using after List : "+limit);
		List<Integer> skip = list.stream().skip(3).collect(Collectors.toList());
		System.out.println("skip() using after List : "+skip);
	}

}
