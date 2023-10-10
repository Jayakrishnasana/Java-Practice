package allprograms.collections.implementations1;

class Node1{
	int key;
	Node1 next;
	public Node1(int key, Node1 next) {
		super();
		this.key = key;
		this.next = next;
	}
	
	
}
public class HashSet {
	private Node1[] a=new Node1[10];
	private int count=0;
	
	public boolean add(int key) {
		int index=key%10;
		if(a[index]==null) {
			a[index]=new Node1(key,null);
			count++;
			return true;
		}
		Node1 curr=a[index];
		Node1 pre=null;
		while(curr.next!=null) {
			if(curr.key==key) return false;
			pre=curr;
			curr=curr.next;
			
		}
		
		pre=new Node1(key,null);
		count++;
		return true;
		
	}
	
	public int size() {
		return count;
	}
	public void display() {
		for(int i=0;i<a.length;i++) {
			
			Node1 curr=a[i];
			while(curr!=null) {
				System.out.println(curr.key+"  ");
				curr=curr.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		HashSet a = new HashSet();
		System.out.println(a.add(10));
		System.out.println(a.add(40));
		
		a.add(20);
		a.add(30);
		System.out.println(a.size());
		a.display();
		
	}
}
