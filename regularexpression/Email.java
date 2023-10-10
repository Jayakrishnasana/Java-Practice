package allprograms.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter email : ");
			String s=sc.next();
			
			
//		String mail="[a-z0-9]*[@][a-z]*[.]com";
			String mail="[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z0-9]+[.]com";
			
			Pattern p=Pattern.compile(mail);
			Matcher m=p.matcher(s);
			

			
			System.out.println(m.matches());
		}
	

	}

}
