package allprograms.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a[123]");
		Matcher m=p.matcher("a1ab2abb3ab5ab1ab2abn");
		
		while(m.find()) {
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println(m.group());
			System.out.println("-------------");
		}

	}

}
