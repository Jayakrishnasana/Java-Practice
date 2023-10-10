package allprograms.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*]).{6,9}");
		Matcher m=p.matcher("Jaya@458");
		System.out.println(m.matches());
		

	}

}
