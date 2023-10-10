package allprograms.apistreammethod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurences {
	public static void main(String[] args) {
		String str="welcome to chenna Tec Point new and Tech Point to welcome new welcome";
		List<String> list=Arrays.asList(str.split(" "));
		System.out.println(list);
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}

}
