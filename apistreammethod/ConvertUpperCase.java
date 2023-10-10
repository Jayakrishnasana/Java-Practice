package allprograms.apistreammethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUpperCase {
	public static void main(String[] args) {
		List<String> s=Arrays.asList("india","usa","japan");
		List<String> s1=s.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);

		
		
	}
	

}
