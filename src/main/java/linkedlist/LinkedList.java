package linkedlist;

public class LinkedList {

	public static void main(String[] args) {

		LinkedList ll =new LinkedList();
		Node node=null;
		for (int i = 0; i < 10; i++) {

			Node next=ll.new Node(i+1);
			Node prev=ll.new Node(i-1);
			Node current=ll.new Node(i);
			
			 node = ll.new Node(current, next, prev);

		}
		
		while(node.prev != null || node.prev.key !=-1){
			System.out.println(node.key);
		}

	}

	class Node {
		int key;
		Node next;
		Node prev;

		public Node(Node current, Node next, Node prev) {
			this.key=current.key;
			this.next = next;
			this.prev = prev;
		};

		public Node(int key) {
			
			this.key=key;
		}

	}

}
