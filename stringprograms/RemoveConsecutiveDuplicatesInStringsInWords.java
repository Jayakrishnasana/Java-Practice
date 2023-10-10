package allprograms.stringprograms;

public class RemoveConsecutiveDuplicatesInStringsInWords {
	public static void main(String[] args) {
		String s="Bangalore is is is my city i love Bangalore ";
		System.out.println(remove(s));
	}
	public static String remove(String s) {
		String[] sp = s.split(" ");
		
		String s1="";
		for(int i=0;i<sp.length-1;i++) {
			if(!sp[i].equals(sp[i+1])) s1+=sp[i]+" "; 
		}
		s1+=sp[sp.length-1];
		return s1;
	}
	

}
