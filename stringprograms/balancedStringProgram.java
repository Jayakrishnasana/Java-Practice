package allprograms.stringprograms;

import java.util.Stack;

public class balancedStringProgram {

	public static void main(String[] args) {
		String s1="[{()}]";
		System.out.println(isBalanced(s1));

	}
   static boolean isBalanced(String s) {
	   Stack<Character> stack=new Stack<Character>();
	   for(int i=0;i<s.length();i++) {
		   char c1=s.charAt(i);
		   if(c1=='[' || c1=='{' || c1=='(') {
			   stack.push(c1);
		   }
		   else if(c1==']' || c1=='}' || c1==')') {
			   char c2=stack.pop();
			   if( !pair(c2,c1)) return false;
			   
		   }
	   }
	   if(stack.isEmpty()) return true;
	   else return false;
   }
   static boolean pair(char ch1,char ch2) {
	   if(ch1=='[' && ch2==']') return true;
	   if(ch1=='{' && ch2=='}') return true;
	   if(ch1=='(' && ch2==')') return true;
	   return false;
   }
}
