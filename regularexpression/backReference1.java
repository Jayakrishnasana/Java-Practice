package allprograms.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class backReference1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("([a-z])([0-9])\\1");
		Matcher m=p.matcher("a1ab2bc33cd4D");
		
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
