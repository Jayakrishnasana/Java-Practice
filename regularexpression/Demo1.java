package allprograms.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		Pattern p= Pattern.compile("a");
		Matcher m=p.matcher("banana");
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("--------------");
		}

	}

}
