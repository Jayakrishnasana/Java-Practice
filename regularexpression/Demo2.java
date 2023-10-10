package allprograms.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[abc]");
		Matcher m=p.matcher("banan");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("-------------");
		}

	}

}
