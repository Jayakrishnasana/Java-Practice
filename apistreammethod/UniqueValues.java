package allprograms.apistreammethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueValues {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,34,5,6,3,1,4,3,3,2,2,7,9);
		List<Integer> collect = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}

}
