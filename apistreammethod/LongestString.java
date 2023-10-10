package allprograms.apistreammethod;

import java.util.Arrays;
import java.util.List;

public class LongestString {
	public static void main(String[] args) {
	
	List<String> str=Arrays.asList("java","python","Hibernate","Spring Boot","MicroServices");
	String s=str.stream().reduce((word1, word2)->word1.length()>word2.length()?word1:word2).get();
	System.out.println(s);
	}
}
