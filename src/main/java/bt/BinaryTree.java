/**
 * 
 */
package bt;

import node.Node;

/**
 * @author 212395738
 *
 */
public class BinaryTree {

	Node root;
	int key;
	
	public BinaryTree(){
		root=null;
	}
	
	public BinaryTree(int item){
		root =new Node(item);
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
		BinaryTree tree=new BinaryTree();
		
		tree.root=new Node(1);
		
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		
		
		tree.root.left.left=new Node(4);
		
		System.out.println(tree);
		
	}
	
	
	

}
