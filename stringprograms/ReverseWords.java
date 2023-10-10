package allprograms.stringprograms;

public class ReverseWords {
	public static void main(String[] args) {
		String s = "i love programming very much";
		String[] split = s.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}
		
		
	}
	

}
