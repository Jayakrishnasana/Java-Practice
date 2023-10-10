package allprograms.dateandtime;

import java.util.Calendar;
import java.util.Scanner;

public class FindDayFromdate {
	public static String daysOfWeek(int day,int month,int year) {
		Calendar c=Calendar.getInstance();
		c.set(year, month-1, day);
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int n=c.get(Calendar.DAY_OF_WEEK);
		return days[n-1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date(dd:mm:yyyy) :");
		String str=sc.nextLine();
		int day=Integer.parseInt(str.substring(0, 2));
		int month=Integer.parseInt(str.substring(3, 5));
		int year=Integer.parseInt(str.substring(6, 10));
		
		System.out.println(daysOfWeek(day, month, year));
	}

}
