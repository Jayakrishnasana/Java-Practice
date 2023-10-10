package allprograms.collections.implementations1;

import java.util.LinkedList;
import java.util.Queue;

public class BinartTreeYT {
	
	static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
			
	}
	
	
	static class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int[] nodes) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
			
		}
		
		public static void preorder(Node root) {
			if(root==null) return;
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		public static void inorder(Node root) {
			if(root==null) return;
			
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
		public static void postorder(Node root) {
			if(root==null) return;
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
		
		
		public static void levelorder(Node root) {
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node currNode=q.remove();
				if(currNode==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}
					else {
						q.add(null);
					}
				}
				else {
					System.out.print(currNode.data+" ");
					if(currNode.left!=null) q.add(currNode.left);
					if(currNode.right!=null) q.add(currNode.right);
				}
			}
		}
		
		
		public static int countNodes(Node root) {
			if(root==null) return 0;
			int leftNodes = countNodes(root.left);
			int RightNodes = countNodes(root.right);
			return leftNodes+RightNodes+1;
		}
		
		public static int sumofNodes(Node root) {
			if(root==null) return 0;
			int leftsum = sumofNodes(root.left);
			int rightsum = sumofNodes(root.right);
			return leftsum+rightsum+root.data;
		}
		
		public static int heightofNode(Node root) {
			if(root==null) return 0;
			int leftNode = heightofNode(root.left);
			int rightNode = heightofNode(root.right);
			return Math.max(leftNode, rightNode)+1;
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree binaryTree = new BinaryTree();
		Node root = BinaryTree.buildTree(nodes);
		System.out.println("Root Node");
		System.out.println(root.data);
		System.out.println("preorder");
		binaryTree.preorder(root);
		System.out.println();
		System.out.println("inorder");
		binaryTree.inorder(root);
		System.out.println();
		System.out.println("postorder");
		binaryTree.postorder(root);
		System.out.println();
		System.out.println("levelOrder");
		binaryTree.levelorder(root);
		System.out.println("No of Nodes..");
		System.out.println(binaryTree.countNodes(root));
		System.out.println("Sum of Nodes");
		System.out.println(binaryTree.sumofNodes(root));
		System.out.println("Maximum height of Node");
		System.out.println(binaryTree.heightofNode(root));
		
		
		
	}

}
