package allprograms.stringprograms;

public class ChangeFirstwordFirstCharacterWithSecondWordFirstCharacter {

	public static void main(String[] args) {
		String s1="java is very easy";
		char[] a=s1.toCharArray();
		int i=0,j=0,len=a.length-1;
		while(a[len]!=' ') len--;
		while(true) {
			while(a[j]!=' ') j++;
			if(j==len) break;
			int k=j+1;
			char temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			i=k;
			j++;
		}
		System.out.println(new String(a));

	}

}
//iava vs jery easy