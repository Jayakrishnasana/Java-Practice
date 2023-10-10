package allprograms.collections;

import java.util.Stack;

public class FindLeafNodesInTree {
	
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		public static void findLeafNodes(Node root) {
				if(root==null) return;

				
				if(root.left==null && root.right==null) {
					System.out.print(root.data+" ");
				}
				
				if(root.left!=null) {
					findLeafNodes(root.left);
				}
				if(root.right!=null) {
					findLeafNodes(root.right);
				}
			
		}
		
		public static void main(String[] args) {
//		  int[] d= {1,2,4,5,3,6,2};
			FindLeafNodesInTree tree = new FindLeafNodesInTree();
			
			Node root=new Node(1);
			root.left=new Node(2);
			root.left.left=new Node(3);
			root.right=new Node(4);
			root.right.left=new Node(5);
			root.right.right=new Node(6);
			root.right.left.right=new Node(7);
			
			findLeafNodes(root);
			
		}
		
	}
	

}
