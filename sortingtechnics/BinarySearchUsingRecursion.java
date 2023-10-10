package allprograms.sortingtechnics;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {

      int[] a= {3,4,5,6,78};
      System.out.println(Search(a,5,0,a.length));
      System.out.println(Search(a,78,0,a.length));
      System.out.println(Search(a,46,0,a.length));

	}
   static int Search(int[] a,int e,int first,int last) {
	   if(first>last) return -1;
	   int mid=(first+last)/2;
	   if(e==a[mid]) return mid;
	   else if(e>a[mid]) return Search(a,e,mid+1,last);
	   else return Search(a,e,first,mid-1);  
	   
   }
}
