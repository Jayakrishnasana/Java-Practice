package allprograms.collections.implementations1;

public class DoubleLinkedList {
	private Node first=null;
	private int count=0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next= new Node(e,null,curr);
		count++;
	}
	
	public void add(int index,Object e) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=new Node(e,first,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		Node pre=null;
		Node n=new Node(e,curr.next,curr);
		
		curr.next=n;
		count++;
		
	}
	public Object get(int index) {
		if(index<=-1 || index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	public int size() {
		return count;
	}
	
	

	
	
	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add(10);
		a.add(50);
		a.add(10);
		a.add(50);
		a.add(10);
		a.add(50);
	   
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	
		System.out.println();
		a.add(1, 100);
	    a.add(4, 100);
	    a.add(7, 200);
	    a.add(500);
	    for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
}

