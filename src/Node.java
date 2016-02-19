
public class Node {
	
	public int value;
	public Node next;
	
	public Node(int num) {
		this.value = num;
		this.next = null;
		
	}
	
	public Node(Node n) {
		
		this.value = n.value;
		this.next = n.next;
	}
	
}
