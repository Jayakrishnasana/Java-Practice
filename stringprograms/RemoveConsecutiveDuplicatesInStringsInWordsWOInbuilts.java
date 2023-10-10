package allprograms.stringprograms;

import java.util.Scanner;

public class RemoveConsecutiveDuplicatesInStringsInWordsWOInbuilts {
	
	public static void main(String[] args) {
		String s="Bangalore is is is my city i love Bangalore";
		try (Scanner sn = new Scanner(s)) {
			String n="";
			String s1="";
			while(sn.hasNext()) {
				String n1=sn.next();
				if(!isEqulas(n, n1)) s1+=n1+" ";
				n=n1;
				
			}
			System.out.println(s1);
		}
		
	}
	public static boolean isEqulas(String s,String s1) {
		char[] charArray = s.toCharArray();
		char[] charArray1 = s1.toCharArray();
		int count=0,count1=0;
		for (char c : charArray) {
			count++;
		}
		for (char c1 : charArray1) {
			count1++;
		}
		if(count!=count1) return false;
		for(int i=0;i<count;i++) {
			if(charArray[i]!=charArray1[i]) return false;
			
		}
		return true;
	}
	
	
	
}
