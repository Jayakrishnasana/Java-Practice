package allprograms.collections.implementations1;

public class ArrayList {
	private Object[] a=new Object[10];
	private int p=0;
	
	//add element in ArrayList
	
	public void add(Object e) {
		if(p>a.length)  increase();
		a[p++]=e;
	}
	
	//Get size method
	public int size() {
		return p;
	}
	
	//get value by using index
	public  Object get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	
	//increase size by increase method
	public void increase() {
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++) {
			temp[i]=a[i];
		}
	}
		
		//add value particular position 
		public void add(int index,Object e) {
			if(index<=-1||index>=size()) {
				throw new IndexOutOfBoundsException();
			}
			if(p>=a.length) increase();
			for(int i=size()-1;i>=index;i--) {
				a[i+1]=a[i];
			}
			a[index]=e;
			p++;
				
	}
		//Remove particular element .............
		public void remove(int index) {
			if(index==-1||index>=size()) {
				throw new IndexOutOfBoundsException();
			}
			
			for(int i=index+1;i<=size();i++) {
				a[i-1]=a[i];
			}
			p--;
			a[p]=null;
		}
		//Remove Total Array
		public void clear() {
			a=new Object[5];
			p=0;
		}
		
	
	
	public static void main(String[] args) {
		ArrayList o=new ArrayList();
		 o.add(10);
		 o.add(20);
		 o.add(40); 
		 
		// o.add(0,80);
		 o.remove(1);
		// o.clear();
		 for(int i=0;i<o.size();i++) {
			 System.out.println((Integer)o.get(i));
		 }
		
	 
	}
}
