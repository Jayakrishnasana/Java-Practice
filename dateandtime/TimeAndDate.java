package allprograms.dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeAndDate {

	public static void main(String[] args) {
		long millis=System.currentTimeMillis();
		Date date=new Date(millis);
		System.out.println(date);
		
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd ");
		LocalDateTime now=LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		DateTimeFormatter tdf=DateTimeFormatter.ofPattern("HH:MM :ss"); 
		LocalDateTime n=LocalDateTime.now();
		System.out.println(tdf.format(n));

	}

}
