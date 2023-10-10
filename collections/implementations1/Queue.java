package allprograms.collections.implementations1;

public class Queue {
	private Node first=null;
	private int count=0;
	private Node ele=null;;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
	}
	
	public int size() {
		return count;
	}
	public  boolean isEmpty() {
		return first==null;
	}
	public Object peek() {
		if(first==null) return null;
		return first=ele;
	}
	public Object poll() {
		if(first==null) return null;
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	

	
	public static void main(String[] args) {
		Queue a=new Queue();
		
		a.add(3);
		a.add(19);
		a.add(67);
		
		while(!a.isEmpty()) {
			System.out.println(a.poll());
			
		}
		
		
		
		
	}
}
