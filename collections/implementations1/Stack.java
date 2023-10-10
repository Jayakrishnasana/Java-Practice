package allprograms.collections.implementations1;

import java.util.EmptyStackException;

public class Stack {
	private Node first=null;
	private int count=0;
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public int size() {
		return count;
	}
	
	public void push(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
	}
	
	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Node current=first;
		for(int i=1;i<size();i++) {
			current=current.next;
		}
		
		return current.ele;
		
	}
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		
	
		while(!s.isEmpty()) {
			System.out.println(s.pop());
			
		}
		
	}

}
