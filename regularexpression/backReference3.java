package allprograms.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class backReference3 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("([a-z]+)\\1");
		Matcher m=p.matcher("banana");
		
		while(m.find()) {
			System.out.println(m.group());
		}
		

	}

}
