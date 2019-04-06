/**
 * 
 */
package node;

/**
 * @author 212395738
 *
 */
public class Node {

	public Node right, left;
	
	int item;
	
	public Node(int key){
		item=key;
		right=left=null;
	}
	
}
