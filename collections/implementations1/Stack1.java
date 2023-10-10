package allprograms.collections.implementations1;
public class Stack1 {
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}	
	}
	
	static class Stack{
		public static Node head;
		
		public static boolean isEmpty() {
			return head==null;
		}
		
		public static void push(int data) {
			if(isEmpty()) {
				head=new Node(data);
				return;	
			}
			head.next=head;
			head=new Node(data);
			
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=head.data;
			head=head.next;
			return top;
		}
		
		public static int peek() {
			
			return head.data;
		}
	}
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(100);
		
		
		
		while(!s.isEmpty()) {
			
			System.out.println(s.peek());
			s.pop();
		
		}
		
	}
	
}

