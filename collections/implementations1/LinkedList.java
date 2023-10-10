package allprograms.collections.implementations1;

import java.util.Arrays;

class Node{
	Object ele;
	Node next;
	Node curr;
	//Constructor 
	public Node(Object e, Node n) {
		this.ele = e;
		this.next = n;
	}
	public Node(Object e, Node n, Node c) {
		super();
		this.ele = e;
		this.next = n;
		this.curr = c;
	}	
	
}
public class LinkedList {
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	//add element
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null);
		last=last.next;
		count++;
		
	}
	
	//add element particular position
	public void add(int index,Object e) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==1) {
			first=new Node(e,first);
			count++;
			return;
		}
		Node current=first;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		current.next=new Node(e,current.next);
		count++;
		
	}
	
	
	//remove element
	
	public void remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index==0) {
			first=first.next;
			count--;
			return;
		}
		Node current=first;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		current.next=current.next.next;
		count--;
			
	}
	//get the value using get method
	public Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}

		Node current=first;
		for(int i=1;i<=index;i++) {
			current=current.next;
		}
		return current.ele;
	}
	
	//find size
	public int size() {
		return count;
	}
	
	
	
	//reverse Linked list 
	public void reverse() {
		Node pre=null,next=null,current=first;
		while(current!=null) {
			next=current.next;
			current.next=pre;
			pre=current;
			current=next;
		}
		first=pre;
	}
	
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(1,100);
		l.add(3, 300);
		
		
		for(int i=0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}
		System.out.println();
		l.reverse();
		for(int i=0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}
	
	  
	  l.remove(4);
	  l.remove(0);
		System.out.println();
		
		for(int i=0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}
		l.reverse();
		
		for(int i=0;i<l.size();i++) {
			System.out.println((Integer)l.get(i));
		}
		
		
		
	}
	

}
