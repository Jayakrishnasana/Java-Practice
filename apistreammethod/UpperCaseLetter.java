package allprograms.apistreammethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseLetter {
	public static void main(String[] args) {
		List<String> s=Arrays.asList("india","usa","america","japan");
		String str =s.stream().map(e->e.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str);
		
	}

	
	

}
