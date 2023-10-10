package allprograms.numberprograms;

import java.util.ArrayList;
import java.util.List;

public class Fibabnocii {
//	public static void main(String[] args) {
//		int start=0,end=150;
//		int a=start,b=start+1,c=0;
//		List<Integer> l=new ArrayList<>();
//		l.add(a);
//		l.add(b);
//		for(int i=start;i<=end;i++) {
//			
//			
//			
//			c=a+b;
//			a=b;
//			b=c;
//			
//			l.add(c);
//			
//			
//			
//		}
//		System.out.println(l);
////		int n=50,n1=2600;
////		for(int i=n;i<n1;i++) {
////			if(l.get(i)%4==0) {
////				System.out.println(l.get(i));
////				break;
////			}
////		}
//		
//		for(int i=0;i<l.size();i++) {
//			if(l.get(i)>=50&&l.get(i)<=2600) {
//				if(l.get(i)%4==0) {
//					System.out.println(l.get(i));
//					break;
//				}
//			}
//			
//		}
//	}
	
	
	
	public static void main(String[] args) {
		int i=3,j=150;
		int a=0,b=1,c;
		boolean check = false;
		while(b<=j) {
			if(a>=i&&b<=j) {
//				System.out.print(a+"   ");
				if(a%4==0) {
					System.out.println(a);
					check = true;
					break;
				}
			}
			c=a+b;
			a=b;
			b=c;
		}
		if(check!=true) System.out.println(0);
	}

}
